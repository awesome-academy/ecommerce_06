package app.dao;

import app.model.AccountEntity;

public interface AccountDao extends BaseDAO<Integer, AccountEntity> {

    AccountEntity findByEmail(String userName);
}
