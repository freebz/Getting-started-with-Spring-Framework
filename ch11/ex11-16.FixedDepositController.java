// 예제 11-16: FixedDepositController 클래스 - @InitBinder 어노테이션 사용

package sample.spring.chapter11.web;

import java.text.SimpleDateFormat;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Controller
.....
public class FixedDepositController {
    .....
    @ModelAttribute(value = "newFixedDepositDetails")
    public FixedDepositDetails getNewFixedDepositDetails() { ..... }

    @InitBinder(value = "newFixedDepositDetails")
    public void initBinder_New(WebDataBinder webDataBinder) {
	webDataBinder.registerCustomEditor(Date.class,
            new CustomDateEditor(new SimpleDateFormat("MM-dd-yyyy"), false));
    }
    .....
}
