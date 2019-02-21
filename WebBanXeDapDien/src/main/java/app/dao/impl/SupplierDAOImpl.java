package app.dao.impl;

import app.dao.SuppilerDao;
import app.model.SupplierEntity;

import java.util.List;

public class SupplierDAOImpl extends GenericDAO<Integer, SupplierEntity> implements SuppilerDao {
    @Override
    public List<SupplierEntity> findAll() {
        return getSession().createQuery("From SupplierEntity").getResultList();
    }

    @Override
    public SupplierEntity getSupplierByName(String name) {
        return (SupplierEntity) getSession().createQuery("From SupplierEntity s Where s.name = :name").setParameter("name", name).getSingleResult();
    }
}
