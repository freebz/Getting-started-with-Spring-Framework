// 예제 5-21: @Required 어노테이션 사용

import org.springframework.beans.factory.annotation.Required;

public class FixedDepositServiceImpl implements FixedDepositService {
    private FixedDepositDao fixedDepositDao;

    @Required
    public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
	this.fixedDepositDao = fixedDepositDao;
    }
    .....
}
