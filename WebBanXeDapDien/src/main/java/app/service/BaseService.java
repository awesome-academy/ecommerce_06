package app.service;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public interface BaseService<P, T> {
    public T findById(Serializable key);

    public T saveOrUpdate(T entity) throws InvocationTargetException, IllegalAccessException;

    public boolean delete(T entity);
}