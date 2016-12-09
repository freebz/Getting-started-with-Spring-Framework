// 예제 13-15: Converter 구현

package sample.spring.chapter13.converter;

import org.springframework.core.convert.converter.Converter;
.....
public class IdToFixedDepositDetailsConverter implements Converter<String, FixedDepositDetails> {

    @Autowired
    private FixedDepositService fixedDepositService;

    @Override
    public FixedDepositDetails convert(String source) {
	return fixedDepositService.getFixedDeposit(Integer.parseInt(source));
    }
}
