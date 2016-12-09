// 예제 13-18: 프로그래밍 방식으로 형변환 수행

import org.springframework.core.convert.ConversionService;
.....
public class FixedDepositController {
    @Autowired
    private ConversionService conversionService;
    .....
    @RequestMapping(params = "fdAction=view", method = RequestMethod.GET)
    public ModelAndView viewFixedDepositDetails(HttpServletRequest request) {
	String fixedDepositId = request.getParameter("fixedDepositId");
	FixedDepositDetails fixedDepositDetails =
	    conversionService.convert(fixedDepositId, FixedDepositDetails.class);
	.....
    }
}
