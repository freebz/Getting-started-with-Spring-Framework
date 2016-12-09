// 예제 13-19: AmountFormatter - Formatter 구현의 예

package sample.string.chapter13.formatter;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

public class AmountFormatter implements Formatter<Long> {

    @Override
    public String print(Long object, Locale locale) {
	String returnStr = object.toString() + " USD";
	if(locale.getLanguage().equals(new Locale("de").getLanguage())) {
	    returnStr = object.toString() + " EURO";
	}
	return returnStr;
    }

    @Override
    public Long parse(String text, Locale locale) throws ParseException {
	String str[] = text.split(" ");
	return Long.parseLong(str[0]);
    }
}
