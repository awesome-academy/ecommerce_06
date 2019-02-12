package app.dao;

import org.hibernate.LockMode;
import java.io.Serializable;

public interface BaseDAO<PK, T> {
	void delete(T entity);

	T saveOrUpdate(T entity);

	T findById(Serializable key);

	T findByIdUsingLock(Serializable key, LockMode lockMode);

}
