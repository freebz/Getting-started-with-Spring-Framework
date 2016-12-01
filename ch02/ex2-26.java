// 예제 2-26: SingletonTest JUnit 테스트 클래스의 testSingletonScopePerBeanDef 메소드

package sample.spring.chapter02.bankapp;

import static org.junit.Assert.assertNotSame;

public class SingletonTest {
    private static ApplicationContext context;
    .....
    @Test
    public void testSingletonScope() {
	FixedDepositDao fixedDepositDao1 = (FixedDepositDao) context.getBean("dao");
	FixedDepositDao fixedDepositDao2 = (FixedDepositDao) context.getBean("anotherDao");
	
	assertNotSame("Same FixedDepositDao instances", fixedDepositDao1, fixedDepositDao2);
    }
}
