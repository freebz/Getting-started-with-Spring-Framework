// 예제 4-19: CustomerRequestServiceImpl 클래스

package sample.spring.chapter04.bankapp.service;
.....
public class CustomerRequestServiceImpl implements CustomerRequestService {
    private CustomerRequestDao customerRequestDao;
    .....
    public Object getMyBean(String beanName) {
	return null;
    }
    
    @Override
    public void submitRequest(String requestType, String requestDescription) {
	// -- CustomerRequestDetails 객체에 데이터를 입력하고 저장한다.
	CustomerRequestDetails customerRequestDetails =
	    (CustomerRequestDetails) getMyBean("customerRequestDetails");
	customerRequestDetails.setType(requestType);
	customerRequestDetails.setDescription(requestDescription);
	customerRequestDao.submitRequest(customerRequestDetails);
    }
}
