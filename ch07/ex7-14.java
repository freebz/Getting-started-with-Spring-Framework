// 예제 7-14: BankApp 클래스

package sample.spring.chapter07.bankapp;

public class BankApp {
    .....
    public static void main(String args[]) throws Exception {
	ApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");

	BankAccountService bankAccountService = context.getBean(BankAccountService.class);
	FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
	
	BankAccountDetails bankAccountDetails = new BankAccountDetails();
	bankAccountDetails.setBalanceAmount(1000);
	.....
	int bankAccountId = bankAccountService.createBankAccount(bankAccountDetails);

	FixedDepositDetials fixedDepositDetails = new FixedDepositDetails();
	fixedDepositDetails.setFixedDepositAmount(1500);
	fixedDepositDetails.setBankAccountId(bankAccountId);
	.....
	int FixedDepositId = fixedDepositService.createFixedDeposit(fixedDepositDetails);
	.....
    }
}
