// 예제 12-24: URI 템플릿을 지정하는 클래스 및 메서드 단계의 @RequestMapping 어노테이션

@Controller
@RequestMapping(value="/service/{serviceId}", .....)
public class SomeController {
    .....
    @RequestMapping(value="/users/{userId}/bankstatements/{statementId}", .....)
    public void getBankStatementForUser(
	@PathVariable Map<String, String> allVariables) {
	.....
    }
}
