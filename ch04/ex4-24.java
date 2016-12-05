// 예제 4-24: CustomerRegistrationServiceImpl 클래스

package sample.spring.chapter04.bankapp.service;

public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {
    
    private CustomerRegistrationDetails customerRegistrationDetails;
    private CustomerRegistrationDao customerRegistrationDao;
    .....
    public void setCustomerRegistrationDetails(
        CustomerRegistrationDetails customerRegistrationDetails) {
	this.customerRegistrationDetails = customerRegistrationDetails;
    }
    public void setCustomerRegistrationDao(
        CustomerRegistrationDao customerRegistrationDao) {
	this.customerRegistrationDao = customerRegistrationDao;
    }
    .....
}
