// 예제 12-27: @MatrixVariable 어노테이션 - 이름이 같은 여러 행렬 변수

/* 요청 URI가 /bankstatements/123;id=555/user/me;id=777 인 경우
 * 555는 someId 인자로 할당되고 777은 someOtherId 인자로 할당된다.
 */

@Controller
public class SomeController {
    .....
    @RequestMapping(value="/bankstatements/{statementId}/user/{userId}", ..)
    public void getBankStatementForUser(
        @MatrixVariable(value = "id", pathVar = "statementId") int someId,
	@MatrixVariable(value = "id", pathVar = "userId") int someOtherId) {
	.....
    }
}
