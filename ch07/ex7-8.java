// 예제 7-8: BankApp 클래스

package sample.spring.chapter07.bankapp;
.....
public class BankApp {
    private static Logger logger = Logger.getLogger(BankApp.class);

    public static void main(String args[]) throws Exception {
	ApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");

	BankAccountService bankAccountService = context.getBean(BankAccountService.class);
	BankAccountDetails bankAccountDetails = new BankAccountDetails();
	.....
	int bankAccountId = bankAccountService.createBankAccount(bankAccountDetails);
	.....
	FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
	FixedDepositDetials fixedDepositDetails = new FixedDepositDetails();
	.....
	int FixedDepositId = fixedDepositService.createFixedDeposit(fixedDepositDetails);
	.....
    }
}
