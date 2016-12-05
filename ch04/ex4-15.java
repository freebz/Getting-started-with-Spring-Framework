// 예제 4-15: 스프링의 ApplicstionContextAware 인터페이스를 구현하는 CustomerRequestServiceContextAwareImpl 클래스

package sample.spring.chapter04.bankapp.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CustomerRequestServiceContextAwareImpl implements
    CustomerRequestService, ApplicationContextAware {

    private CustomerRequestDao customerRequestDao;
    private ApplicationContext applicationContext;

    @ConstructorProperties({ "customerRequestDao" })
    public CustomerRequestServiceImpl(CustomerRequestDao customerRequestDao) {
	this.customerRequestDao = customerRequestDao;
    }

    public void setApplicationContext(ApplicationContext applicationContext)
	throws BeansException {
	this.applicationContext = applicationContext;
    }
    
    public void submitRequest(String requestType, String requestDescription) {
	CustomerRequestDetails customerRequestDetails = applicationContext
	    .getBean(CustomerRequestDetails.class);
	customerRequestDetails.setType(requestType);
	customerRequestDetails.setDescription(requestDescription);
	customerRequestDao.submitRequest(customerRequestDetails);
    }
}
