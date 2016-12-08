// 예제 9-5: BankAccountServiceImpl 클래스

package sample.spring.chapter09.bankapp.service;

import org.springframework.aop.framework.AopContext;
.....
@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {
    .....
    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
	//-- 프락시를 얻고 프락시를 통해 isDuplicateAccount 메서드 실행
	boolean isDuplicateAccount =
	    ((BankAccountService)AopContext.currentProxy()).isDuplicateAccount(bankAccountDetails);
	
	if(!isDuplicateAccount) { ..... }
	.....
    }

    @Override
    public boolean isDuplicateAccount(BankAccountDetails bankAccountDetails) { ..... }
}
