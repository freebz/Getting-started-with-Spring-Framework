// 예제 8-32: BankApp 클래스

package sample.spring.chapter08.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
    public static void main(String args[]) throws Exception {
	ApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");

	BankAccountService bankAccountService = context.getBean(BankAccountService.class);
	BankAccountDetails bankAccountDetails = new BankAccountDetails();
	.....
	int bankAccountId = bankAccountService.createBankAccount(bankAccountDetails);

	FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
	FixedDepositDetails fixedDepositDetails = new FixedDepositDetails();
	.....
	fixedDepositDetails.setEmail("someUser@someDomain.com");
	fixedDepositService.createFixedDeposit(fixedDepositDetails);

	fixedDepositService.createFixedDeposit(fixedDepositDetails);
	.....
	List<FixedDepositDetails> fixedDepositDetailsList = fixedDepositService
	    .findFixedDepositsByBankAccount(bankAccountId);

	for (FixedDepositDetails detail : fixedDepositDetailsList) {
	    fixedDepositService.getFixedDeposit(detail.getFixedDepositId());
	}

	for (FixedDepositDetials detail : fixedDepositDetalsList) {
	    fixedDepositService.getFexedDepositFromCache(detail.getFixedDepositId());
	}
	.....
    }
}
