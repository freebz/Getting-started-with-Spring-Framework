// 예제 2-23: SingletonTest JUnit 테스트 클래스의 testReference 메소드

package sample.spring.chapter02.bankapp;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SingletonTest {
    private static ApplicationContext context;
    .....
    @Test
    public void testInstances() {
	FixedDepositController controller = (FixedDepositController) context.getBean("controller");

	FixedDepositDao fixedDepositDao1 =
	    controller.getFixedDepositService().getFixedDepositDao();
	FixedDepositDao fixedDepositDao2 = (FixedDepositDao) context.getBean("dao");
	assertSame("Different FixedDepositDao instances", fixedDepositDao1, fixedDepositDao2);
    }
}
