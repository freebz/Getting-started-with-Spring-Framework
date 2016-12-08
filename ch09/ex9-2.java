// 예제 9-2: BankApp 클래스

package sample.spring.chapter09.bankapp;
.....
public class BankApp {
    public static void main(String args[]) throws Exception {
	ApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");

	BankAccountService bankAccountService = context.getBean(BankAccountService.class);
	BankAccountDetails bankAccountDetails = new BankAccountDetails();
	bankAccountDetails.setBalanceAmount(1000);
	bankAccountDetails.setLastTransactionTimestamp(new Date());
	bankAccountService.createBankAccount(bankAccountDetails);

	FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
	fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000,
            12, "someemail@somedomain.com"));
    }
}
