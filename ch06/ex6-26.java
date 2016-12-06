// 예제 6-26: BankApp 클래스

package sample.spring.chapter06.bankapp;

public class BankApp {
    public static void main(String args[]) throws Exception {
	AppliccationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");

	FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);

	fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 0,
                12, "someemail@somedomain.com"));
	fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000,
                12, "someemail@somedomain.com"));
    }
}
