// 예제 3-61: Bankapp 클래스

package sample.spring.chapter03.bankapp;
.....
public class BankApp {
    private static Logger logger = Logger.getLogger(BankApp.class);

    public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext(
            .....
	    logger.info("Invoking getBean(\"eventFactory\") returns : " +
		context.getBean("eventSenderFactory"));
	    logger.info("Invoking getBean(\"&eventFactory\") returns : " +
		context.getBean("&eventSenderFactory"));
    }
}
