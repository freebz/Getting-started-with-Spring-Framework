// 예제 5-20: BankApp 클래스

package sample.spring.chapter05.bankapp;

public class BankApp {
    public static void main(String args[]) throws Exception {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
	context.registerShutdownHook();
	.....
	context.getBean("eventSenderFactory");
	context.getBean("eventSenderFactory");
    }
}
