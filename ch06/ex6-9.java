// 예제 6-9: required 특성이 false인 @Autowired 어노테이션이 지정된 생성자를 여러 개 정의하는 컴포넌트 클래스

@Service(value="customerRequestService")
public class CustomerRequestServiceImpl implements CustomerRequestService {
    public CustomerRequestServiceImpl() {
	.....
    }
    @Autowired(required=false)
    public CustomerRequestServiceImpl(CustomerRequestDetails customerRequestDetails) {
	.....
    }
    @Autowired(required=false)
    public CustomerRequestServiceImpl(CustomerRequestDetails customerRequestDetails,
        CustomerRequestDao customerRequestDao) {
	.....
    }
}
