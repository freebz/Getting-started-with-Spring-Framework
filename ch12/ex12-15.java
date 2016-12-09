// 예제 12-15: FixedDepositWSClient의 getFixedDepositList 메서드

package sample.spring.chapter12;
.....
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class FixedDepositWSClient {
.....
    private static ApplicationContext context;
    
    private static void getFixedDepositList(RestTemplate restTemplate) {
	HttpHeaders headers = new HttpHeaders();
	headers.add("Accept", "application/json");

	HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

	ParameterizedTypeReference<List<FixedDepositDetails>> typeRef =
	    new ParameterizedTypeReference<List<FixedDepositDetails>>() {
	};

	ResponseEntity<List<FixedDepositDetails>> responseEntity = restTemplate
	    .exchange("http://localhost:8080/ch12-webservice/fixedDeposits",
	        HttpMethod.GET, requestEntity, typeRef);

	    List<FixedDepositDetails> fixedDepositDetails = responseEntity.getBody();
	    logger.info("List of fixed deposit details: \n" + fixedDepositDetails);
        }
        .....
    }
