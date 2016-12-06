// 예제 6-7: CustomerRequestServiceImpl 클래스 - 생성자 단계에 @Autowired 어노테이션 사용

package sample.spring.chapter06.bankapp.service;

@Service(value="customerRequestService")
public class CustomerRequestServiceImpl implements CustomerRequestService {

    private CustomerRequestDetails customerRequestDetails;
    private CustomerRequestDao customerRequestDao;
    
    @Autowired
    public CustomerRequestServiceImpl(CustomerRequestDetails customerRequestDetails,
         CustomerRequestDao customerRequestDao) {
	this.customerRequestDetails = customerRequestDetails;
	this.customerRequestDao = customerRequestDao;
    }
    .....
}
