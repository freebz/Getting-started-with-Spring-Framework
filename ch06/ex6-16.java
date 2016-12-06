// 예제 6-16: @DependsOn 어노테이션 사용

@DependsOn(value = {"beanA", "beanB"})
@Component
public class Sample { ..... }
