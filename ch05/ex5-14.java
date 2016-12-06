// 예제 5-14: FixedDepositServiceImpl 클래스

package sample.spring.chapter05.bankapp.service;

import sample.spring.chapter05.bankapp.common.DependencyResolver;
import sample.spring.chapter05.bankapp.common.MyApplicationContext;

public class FixedDepositServiceImpl implements FixedDepositService, DependencyResolver {
    private FixedDepositDao fixedDepositDao;
    .....
    @Override
    public void resolveDependency(MyApplicationContext myApplicationContext) {
	fixedDepositDao = myApplicationContext.getBean(FixedDepositDao.class);
    }
}
