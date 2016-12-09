// 예제 12-20: FixedDepositWSAsyncClient - openFixedDeposit 메서드

package sample.spring.chapter12;

import org.springframework.http.HttpEntity;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.client.AsyncRestTemplate;

public class FixedDepositWSClient {
    private static ApplicationContext context;

    public static void main(String args[]) {
	context = new ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml");
	.....
	openFixedDeposit(context.getBean(AsyncRestTemplate.class));
    }
    
    private static void openFixedDeposit(AsyncRestTemplate restTemplate) {
	FixedDepositDetails fdd = new FixedDepositDetails();
	fdd.setDepositAmount("9999");
	.....
	HttpEntity<FixedDepositDetails> requestEntity = new HttpEntity<FixedDepositDetails>(fdd);

	ListenableFuture<ResponseEntity<FixedDepositDetails>> futureResponseEntity =
	    restTemplate.postForEntity("http://localhost:8080/ch12-webservice/fixedDeposits",
                requestEntity, FixedDepositDetails.class);

	futureResponseEntity
	    .addCallback(new ListenableFutureCallback<ResponseEntity<FixedDepositDetails>>() {
		@Override
		public void onSuccess(ResponseEntity<FixedDepositDetails> entity) {
		    FixedDepositDetails fixedDepositDetails = entity.getBody();
		}

		@Override
		public void onFailure(Throwable t) {}
	    });
    }
}
