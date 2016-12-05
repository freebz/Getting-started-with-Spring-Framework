// 예제 4-31: AccountStatementServiceImpl 클래스

package sample.spring.chapter04.bankapp.service;

import sample.spring.chapter04.bankapp.dao.AccountStatementDao;
import sample.spring.chapter04.bankapp.domain.AccountStatement;

public class AccountStatementServiceImpl implements AccountStatementService {
    private AccountStatementDao accountStatementDao;

    public void setAccountStatementDao(AccountStatementDao accountStatementDao) {
	this.accountStatementDao = accountStatementDao;
    }
    .....
}
