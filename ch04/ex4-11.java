// 예제 4-11: BankApp 클래스

package sample.spring.chapter04.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
    private static Logger logger = Logger.getLogger(BankApp.class);

    public static void main(String args[]) throws Exception {
	ApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
	.....
	logger.info("Beginning with accessing CustomerRequestService");
	CustomerRequestService customerRequestService_1 =
	    context.getBean(CustomerRequestService.class);
	.....
	CustomerRequestService customerRequestService_2 =
	    context.getBean(CustomerRequestService.class);
	.....
	logger.info("Done with accessing CustomerRequestService");
    }
}
