// 예제 6-10: FixedDepositServiceImpl 클래스 - @Qualifier 어노테이션 사용

package sample.spring.chapter06.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Service(value="FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {

    @Autowired
    @Qualified(value="myFixedDepositDao")
    private FixedDepositDao myFixedDepositDao;
    .....
}
