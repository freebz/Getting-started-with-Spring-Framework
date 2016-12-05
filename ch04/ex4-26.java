// 예제 4-26: CustomerRequestServiceImpl 클래스

package sample.spring.chapter04.bankapp.service;

public class CustomerRequestServiceImpl implements CustomerRequestService {    
    private CustomerRequestDetails customerRequestDetails;
    private CustomerRequestDao customerRequestDao;

    @ConstructorProperties({ "customerRequestDetails", "customerRequestDao" })
    public CustomerRequestServiceImpl(
        CustomerRequestDetails customerRequestDetails,
	CustomerRequestDao customerRequestDao) {
	this.customerRequestDetails = customerRequestDetails;
	this.customerRequestDao = customerRequestDao;
    }
    .....
}
