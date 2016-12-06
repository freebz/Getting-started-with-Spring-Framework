// 예제 6-12: FixedDepositServiceImpl 클래스

package sample.spring.chapter06.bankapp.service;

import javax.inject.Inject;
import javax.inject.Named;

@Named(value="FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {

    @Inject
    @Named(value="myFixedDepositDao")
    private FixedDepositDao myFixedDepositDao;
    .....
}
