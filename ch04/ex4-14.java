// 예제 4-14: CustomerRequestServiceImpl 클래스

package sample.spring.chapter04.bankapp.service;

import sample.spring.chapter04.bankapp.dao.CustomerRequestDao;
import sample.spring.chapter04.bankapp.domain.CustomerRequestDetails;

public class CustomerRequestServiceImpl implements CustomerRequestService {
    private CustomerRequestDetails customerRequestDetails;
    private CustomerRequestDao customerRequestDao;

    @ConstructorProperties({ "customerRequestDetails", "customerRequestDao" })
    public CustomerRequestServiceImpl(CustomerRequestDetails customerRequestDetails,
        CustomerRequestDao customerRequestDao) {
	this.customerRequestDetails = customerRequestDetails;
	this.customerRequestDao = customerRequestDao;
    }
    
    public void submitRequest(String requestType, String requestDescription) {
	//-- CustomerRequestDetails 객체에 데이터를 입력하고 저장한다.
	customerRequestDetails.setType(requestType);
	customerRequestDetails.setDescription(requestDescription);
	customerRequestDao.submitRequest(customerRequestDetails);
    }
}
