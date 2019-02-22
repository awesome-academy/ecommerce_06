package app.service;

import app.model.AccountEntity;

public interface AccountService extends BaseService<Integer, AccountEntity> {
    boolean createAccount(String email);
}
