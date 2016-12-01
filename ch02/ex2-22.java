// 예제 2-22: SingletonTest JUnit 테스트 클래스

package sample.spring.chapter02.bankapp;

import static org.junit.Assert.assertSame;
import org.junit.BeforeClass;
import org.junit.Test;

import sample.spring.chapter02.bankapp.controller.FixedDepositController;

public class SingletonTest {
    private static ApplicationContext context;

    @BeforeClass
    public static void init() {
	context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
    }

    @Test
    public void testInstances() {
	FixedDepositController controller1 = (FixedDepositController) context.getBean("controller");
	FixedDepositController controller2 = (FixedDepositController) context.getBean("controller");
	assertSame("Different FixedDepositController instances", controller1, controller2);
    }
    .....
}
