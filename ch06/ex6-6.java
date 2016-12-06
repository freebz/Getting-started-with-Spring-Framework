// 예제 6-6: CustomerRegistrationServiceImpl 클래스 - 메서드 단계에 @Autowired 어노테이션 사용

package sample.spring.chapter06.bankapp.service;

@Service(value="customerRegistrationService")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {

    private CustomerRegistrationDetails customerRegistrationDetails;
    .....
    @Autowired
    public void obtainCustomerRegistrationDetails(
         CustomerRegistrationDetails customerRegistrationDetails) {
	this.customerRegistrationDetails = customerRegistrationDetails;
    }
    .....
    @Override
    public void setAccountNumber(String accountNumber) {
	customerRegistrationDetails.setAccountNumber(accountNumber);
    }
    .....
}
