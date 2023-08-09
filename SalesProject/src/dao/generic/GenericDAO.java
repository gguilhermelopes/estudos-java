package dao.generic;

import annotation.KeyType;
import domain.Persistent;
import exception.TypeKeyNotFoundException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

public abstract class GenericDAO <T extends Persistent> implements IGenericDAO<T>{

    private SingletonMap singletonMap;

    public abstract Class<T> getClassType();
    public abstract void updateData(T entity, T registeredEntity);

    public GenericDAO() {
        this.singletonMap = SingletonMap.getInstance();
    }

    public Long getKey(T entity) throws TypeKeyNotFoundException {
        Field[] fields = entity.getClass().getDeclaredFields();
        Long returnValue = null;
        for (Field field : fields) {
            if (field.isAnnotationPresent(KeyType.class)) {
                KeyType keyType = field.getAnnotation(KeyType.class);
                String methodName = keyType.value();
                try {
                    Method method = entity.getClass().getMethod(methodName);
                    returnValue = (Long) method.invoke(entity);
                    return returnValue;
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException error) {
                    //Criar exception de negócio TypeKeyNotFoundException
                    error.printStackTrace();
                    throw new TypeKeyNotFoundException("Chave principal do objeto " + entity.getClass() + " não encontrada.", error);
                }
            }
        }
        if (returnValue == null) {
            String message = "Chave principal do objeto " + entity.getClass() + " não encontrada.";
            System.out.println("**** ERRO ****" + message);
            throw new TypeKeyNotFoundException(message);
        }
        return null;
    }

    @Override
    public Boolean save(T entity) throws TypeKeyNotFoundException {
        Map<Long, T> internMap = (Map<Long, T>) this.singletonMap.getMap().get(getClassType());
        Long key = getKey(entity);
        if (internMap.containsKey(key)) {
            return false;
        }

        internMap.put(key, entity);
        return true;
    }

    @Override
    public void delete(Long value) {
        Map<Long, T> internMap = (Map<Long, T>) this.singletonMap.getMap().get(getClassType());
        T registeredObject = internMap.get(value);
        if (registeredObject != null) {
            internMap.remove(value, registeredObject);
        }

    }

    @Override
    public void update(T entity) throws TypeKeyNotFoundException {
        Map<Long, T> internMap = (Map<Long, T>) this.singletonMap.getMap().get(getClassType());
        Long key = getKey(entity);
        T registeredObject = internMap.get(key);
        if (registeredObject != null) {
           updateData(entity, registeredObject);
        }
    }

    @Override
    public T search(Long value) {
        Map<Long, T> internMap = (Map<Long, T>) this.singletonMap.getMap().get(getClassType());
        return internMap.get(value);
    }

    @Override
    public Collection<T> searchAll() {
        Map<Long, T> internMap = (Map<Long, T>) this.singletonMap.getMap().get(getClassType());
        return internMap.values();
    }
}
