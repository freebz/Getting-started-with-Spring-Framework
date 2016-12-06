// 예제 6-5: AccountStatementServiceImpl 클래스 - 필드 단계에 @Autowired 어노테이션 사용

package sample.spring.chapter06.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="accountStatementService")
public class AccountStatementServiceImpl implements AccountStatementService {

    @Autowired
    private AccountStatementDao accountStatementDao;

    @Override
    public AccountStatement getAccountStatement(Date from, Date to) {
	return accountStatementDao.getAccountStatement(from, to);
    }
}
