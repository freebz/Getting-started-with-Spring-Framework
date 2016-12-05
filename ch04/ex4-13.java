// 예제 4-13: BankApp 클래스

package sample.spring.chapter04.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
    private static Logger logger = Logger.getLogger(BankApp.class);

    public static void main(String args[]) throws Exception {
	ApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
	.....
	logger.info("Beginning with accessing CustomerRegistrationService");
	
	CustomerRegistrationService customerRegistrationService_1 =
	    context.getBean(CustomerRegistrationService.class);
	customerRegistrationService_1.setAccountNumber("account_1");
	customerRegistrationService_1.setAddress("address_1");
	customerRegistrationService_1.setDebitCardNumber("debitCardNumber_1");
	customerRegistrationService_1.register();
	logger.info("registered customer with id account_1");
	
	CustomerRegistrationService customerRegistrationService_2 =
	    context.getBean(CustomerRegistrationService.class);

	.....
	logger.info("registered customer with id account_2");
	logger.info("Done with accessing CustomerRegistrationService");
    }
}
