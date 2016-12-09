// 예제 12-25: URI 템플릿 - 정규식 사용

@Controller
public class SomeController {
    .....
    @RequestMapping(value="/bankstatements/{statementId:[\\d\\d\\d]}.{responseType:[a-z]}", .....)
    public void getBankStatementForUser(@PathVariable("statementId") String statement,
        @PathVariable("responseType") String responseTypeExtension) {
	.....
    }
}
