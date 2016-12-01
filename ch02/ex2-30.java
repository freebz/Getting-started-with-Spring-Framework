// 예제 2-30: PrototypeTest JUnit 테스트 클래스의 testInstances 메서드

package sample.spring.chapter02.bankapp;

import static org.junit.Assert.assertNotSame;

public class PrototypeTest {
    private static ApplicationContext context;
    .....
    @Test
    public void testInstances() {
	FixedDepositDetails fixedDepositDetails1 =
	    (FixedDepositDetails) context.getBean("fixedDepositDetails");
	FixedDepositDetails fixedDepositDetails2 =
	    (FixedDepositDetails) context.getBean("fixedDepositDetails");
	
	assertNotSame("Same FixedDepositDetails instances",
            fixedDepositDetails1, fixedDepositDetails2);
    }
}
