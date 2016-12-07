// 예제 7-11: FixedDepositDaoImpl 클래스 - 하이버네이트 API 사용

package sample.spring.chapter07.bankapp.dao;

import org.hibernate.SessionFactory;
.....
@Repository(value = "FixedDepositDao")
public class FixedDepositDaoImpl implements FixedDepositDao {

    @Autowired
    private SessionFactory sessionFactory;

    public int createFixedDeposit(final FixedDepositDetails fixedDepositDetails) {
	sessionFactory.getCurrentSession().save(fixedDepositDetails);
	return fixedDepositDetails.getFixedDepositId();
    }

    public FixedDepositDetails getFixedDeposit(final int FixedDepositId) {
	String hql = "from FixedDepositDetails as FixedDepositDetails where "
	    + "FixedDepositDetails.FixedDepositId ="
	    + FixedDepositId;
	return (FixedDepositDetails) sessionFactory.getCurrentSession()
	    .createQuery(hql).uniqueResult();
    }
}
