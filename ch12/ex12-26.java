// 예제 12-26: @MatrixVariable 어노테이션

/* 행렬변수는 요청 URI에 이름-값 쌍으로 나오며 메서드 인자로 값을 할당할 수 있다.
 * /bankstatements/123;responseType=json 이라는 요청 URI 에서 responseType 변수는 값이 json인 행렬 변수
 *
 * 스프링은 기본적으로 URL에서 행렬 변수를 제거한다. 행렬 변수를 제거하지 않게 하려면 스프링 mvc 스키마의
 * <annotation-driven> 요소에서 enable-matrix-variables 특성ㅇ르 true로 설정해야 한다.
 */

@Controller
public class SomeController {
    .....
    @RequestMapping(value="/bankstatements/{statementId}", ..)
    public void getBankStatementForUser(@PathVariable("statementId") String statement,
        @MatrixVariable("responseType") String responseTypeExtension) {
	.....
    }
}
