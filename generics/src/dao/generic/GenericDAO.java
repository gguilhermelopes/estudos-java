package dao.generic;

import domain.Persistente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T>{
    protected Map<Class, Map<Long, T>> map;

      public GenericDAO(){
        this.map = new HashMap<>();
        Map<Long, T> internMap = this.map.get(getClassType());
        if(internMap == null){
            internMap = new HashMap<>();
            this.map.put(getClassType(), internMap);
        }
    }
    public abstract void editData(T newEntity, T entity);

    public abstract Class<T> getClassType();




    @Override
    public boolean signUp(T entity) {
        Map<Long, T> internMap = this.map.get(getClassType());
        Long code = entity.getCode();
        if(internMap.containsKey(code)){
            return false;
        }
        internMap.put(code, entity);
        return true;
    }

    @Override
    public void delete(Long code) {
        Map<Long, T> internMap = this.map.get(getClassType());
        T value = internMap.get(code);

        if(value != null){
            internMap.remove(code, value);
        }
    }

    @Override
    public void edit(T entity) {
        Map<Long, T> internMap = this.map.get(getClassType());
        T value = internMap.get(entity.getCode());
        if(value != null){
            editData(entity, value);
        }
    }

    @Override
    public T find(Long code) {
        Map<Long, T> internMap = this.map.get(getClassType());
        return internMap.get(code);
    }

    @Override
    public Collection<T> findMany() {
        Map<Long, T> internMap = this.map.get(getClassType());
        return internMap.values();
    }
}
