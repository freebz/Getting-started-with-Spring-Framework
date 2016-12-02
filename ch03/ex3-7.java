// 예제 3-7: UserRequestControllerImpl 클래스

package sample.spring.chapter03.bankapp.controller;

public class UserRequestControllerImpl implements UserRequestController {
    private ServiceTemplate serviceTemplate;

    public UserRequestControllerImpl(ServiceTemplate serviceTemplate) {
	this.serviceTemplate = serviceTemplate;
    }

    @Override
    public void submitRequest(Request request) {
	//-- ServiceTemplate을 사용하는 작업을 수행
	serviceTemplate.getJmsMessageSender(); //-- 예: JMS 메시지 전송
    .....
    }
}
