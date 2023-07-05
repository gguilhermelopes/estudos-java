package dao.generic;

import java.util.Collection;

public interface IGenericDAO <T> {
    public boolean signUp(T entity);
    public void delete(Long code);
    public void edit (T entity);
    public T find(Long code);
    public Collection<T> findMany();
}
