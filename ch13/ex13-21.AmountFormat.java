// 예제 13-21: AmountFormat 어노테이션

package sample.string.chapter13.formatter;
.....
@Target(value={ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AmountFormat { }
