// 예제 11-5: 모델 특성을 직접 Model 객체로 추가

import org.springframework.ui.Model;
.....
public class SampleWebController {
	
    @ModelAttribute
    public void doSomething(Model model) {
	model.addAttribute("myobject", new MyObject());
	model.addAttribute("otherobject", new OtherObject());
    }
}
