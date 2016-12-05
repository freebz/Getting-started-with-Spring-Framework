// 예제 4-18: BankApp 클래스

package sample.spring.chapter04.bankapp;
.....
public class BankApp {
    private static Logger logger = Logger.getLogger(BankApp.class);

    public static void main(String args[]) throws Exception {
	ApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
	.....
	logger.info("Beginning with accessing CustomerRequestService");
	CustomerRequestService customerRequestService_1 = context
	    .getBean(CustomerRequestService.class);
	customerRequestService_1.submitRequest("checkBookRequest",
            "Request to send a 50-leaf check book");
	customerRequestService_1.submitRequest("checkBookRequest",
            "Request to send a 100-leaf check book");
	.....
	logger.info("Done with accessing CustomerRequestService");
    }
}
