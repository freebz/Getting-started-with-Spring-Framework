// 예제 6-32: BankApp 클래스 - AnnotationConfigApplicationContext 사용

package sample.spring.chapter06.bankapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

    public static void main(String args[]) throws Exception {
	AnnotationConfigApplicationContext context =
	    new AnnotationConfigApplicationContext(BankAppConfiguration.class);

	FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
	fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000,
                12, "someemail@somedomain.com"));
	.....
    }
}
