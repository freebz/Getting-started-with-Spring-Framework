// 예제 6-11: 메서드 매개변수 단계와 생성자 단계에서 @Qualifier 어노테이션 사용

public class Sample {

    @Autowired
    public Sample(@Qualifier("aBean") ABean bean) { .... }

    @Autowired
    public void doSomething(@Qualifier("bBean") BBean bean, CBean cBean) { ..... }
}
