// 예제 5-18: BankApp 클래스

package sample.spring.chapter05.bankapp;

public class BankApp {
    public static void main(String args[]) throws Exception {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
	context.registerShutdownHook();

	FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);

	fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000, 12,
            "someemail@somedomain.com"));
	.....
    }
}
