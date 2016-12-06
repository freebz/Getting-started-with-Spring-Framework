// 예제 5-5: BankAppWithHook 클래스 - JVM에 종료 후크 등록

package sample.spring.chapter05.bankapp;

public class BankAppWithHook {
    public static void main(String args[]) throws Exception {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");

	context.registerShutdownHook();
	
	FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
	fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000,
            12, "someemail@somedomain.com"));
    }
}
