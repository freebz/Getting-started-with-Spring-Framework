// 예제 6-8: @Autowired 어노테이션이 지정된 생성자 두개를 정의하는 컴포넌트 클래스
/*
  두 생성자 중 하나는 의존성 자동연결이 필수(@Autowired의 requried 특성이 true로 설정됨)이고,
  다른 하나는 선택 사항(@Autowired의 requried 특성이 false로 설정됨)이므로 이 예제는 스프링에서 예외를 일으킨다.
*/ 

@Service(value="customerRequestService")
public class CustomerRequestServiceImpl implements CustomerRequestService {

    .....
    @Autowired(required=false)
    public CustomerRequestServiceImpl(CustomerRequestDetails customerRequestDetails) { ..... }

    @Autowired
    public CustomerRequestServiceImpl(CustomerRequestDetails customerRequestDetails,
        CustomerRequestDao customerRequestDao) { ..... }
}
