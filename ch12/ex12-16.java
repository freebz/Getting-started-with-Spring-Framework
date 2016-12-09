// 예제 12-16: FixedDepositWSClient의 openFixedDeposit 메서드

package sample.spring.chapter12;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
.....
public class FixedDepositWSClient {
    .....
    private static void openFixedDeposit(RestTemplate restTemplate) {
	FixedDepositDetails fdd = new FixedDepositDetails();
	fdd.setDepositAmount("9999");
	.....
	ResponseEntity<FixedDepositDetails> responseEntity = restTemplate
	    .postForEntity("http://localhost:8080/ch12-webservice/fixedDeposits",
                fdd, FixedDepositDetails.class);

	FixedDepositDetails fixedDepositDetails = responseEntity.getBody();
	.....
    }
}
