// 예제 4-16: CustomerRequestServiceImpl 클래스 - 빈 조회 메서드 정의

package sample.spring.chapter04.bankapp.service;

public abstract class CustomerRequestServiceImpl implements CustomerRequestService {
    private CustomerRequestDao customerRequestDao;

    @ConstructorProperties({ "customerRequestDao" })
    public CustomerRequestServiceImpl(CustomerRequestDao customerRequestDao) {
	this.customerRequestDao = customerRequestDao;
    }

    public abstract CustomerRequestDetails getCustomerRequestDetails();

    @Override
    public void submitRequest(String requestType, String requestDescription) {
	// -- CustomerRequestDetails 객체에 데이터를 입력하고 저장한다.
	CustomerRequestDetails customerRequestDetails = getCustomerRequestDetails();
	.....
    }
}
