// 예제 13-22: AmountFormatAnnotationFormatterFactory 클래스

package sample.string.chapter13.formatter;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

public class AmountFormatAnnotationFormatterFactory implements
    AnnotationFormatterFactory<AmountFormat> {

    public Set<Class<?>> getFieldTypes() {
	Set<Class<?>> fieldTypes = new HashSet<Class<?>>(1, 1);
	fieldTypes.add(Long.class);
	return fieldTypes;
    }

    public Parser<?> getParse(AmountFormat annotation, Class<?> fieldType) {
	return new AmountFormatter();
    }

    public Printer<?> getPrinter(Annotation annotation, Class<?> fieldType) {
	return new AmountFormatter();
    }
}
