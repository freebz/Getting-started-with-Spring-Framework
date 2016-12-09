// 예제 12-23: 모든 URI 템플릿 변수 및 값 접근

@Controller
public class SomeController {
    .....
    @RequestMapping(value="/users/{userId}/bankstatements/{statementId}", .....)
    public void getBankStatementForUser(
	@PathVariable Map<String, String> allVariables) {
	.....
    }
}
