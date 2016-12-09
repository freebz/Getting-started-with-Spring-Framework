// 예제 12-22: 여러 URI 템플릿 변수

@Controller
public class SomeController {
    .....
    @RequestMapping(value="/users/{userId}/bankstatements/{statementId}", .....)
    public void getBankStatementForUser(
        @PathVariable("userId") String user,
	@PathVariable("statementId") String statement) {
	.....
    }
}
