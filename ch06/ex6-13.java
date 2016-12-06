// 예제 6-13: 필드 단계에 @Resource 어노테이션 사용

import javax.annotation.Resource;

@Named(value="FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {

    @Resource(name="myFixedDepositDao")
    private FixedDepositDao myFixedDepositDao;
    .....
}
