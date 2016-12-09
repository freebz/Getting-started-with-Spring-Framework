// 예제 12-14: FixedDepositWSClient 클래스 - RestTemplate 사용

package sample.spring.chapter12;
.....
import org.springframework.web.client.RestTemplate;

public class FixedDepositWSClient {

    private static ApplicationContext context;

    public static void main(String args[]) {
	context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
	getFixedDepositList(context.getBean(RestTemplate.class));
	getFixedDeposit(context.getBean(RestTemplate.class));
	.....
    }

    private static void getFixedDepositList(RestTemplate restTemplate) {.....}
    .....
}
