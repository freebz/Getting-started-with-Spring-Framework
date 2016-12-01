// 예제 2-24: SingletonTest JUnit 테스트 클래스의 testSingletonScope 메소드

package sample.spring.chapter02.bankapp;

import static org.junit.Assert.assertNotSame;

public class SingletonTest {
    private static ApplicationContext context;
    .....
    @BeforeClass
    public static void init() {
	context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
    }
    
    @Test
    public void testSingletonScope() {
	ApplicationContext anotherContext = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
	
	FixedDepositController fixedDepositController1 =
	    (FixedDepositController) context.getBean("controller");

	FixedDepositController fixedDepositController2 =
	    (FixedDepositController) context.getBean("controller");
	
	assertNotSame("Same FixedDepositController instances", fixedDepositController1, fixedDepositController2);
    }
}
