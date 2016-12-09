// 예제 11-2: @ModelAttribute 사용 - value 특성을 지정하지 않은 경우

import org.springframework.ui.Model;
.....
public class SampleController {
    
    @ModelAttribute
    public Sample getSample() {
	return new Sample();
    }
}
