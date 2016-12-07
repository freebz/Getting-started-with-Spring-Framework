// 예제 7-4: FixedDepositDaoImpl 클래스 - JdbcTemplate을 활용한 데이터 저장

package sample.spring.chapter07.bankapp.dao;

import java.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository(value = "FixedDepositDao")
public class FixedDepositDaoImpl implements FixedDepositDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    ....

    public int createFixedDeposit(final FixedDepositDetails fixedDepositDetails) {
	final String sql =
	    "insert into fixed_deposit_details(account_id, fixedDeposit_creation_date, amount, tenure, active) values(?, ?, ?, ?, ?)";

	KeyHolder keyHolder = new GeneratedKeyHolder();
	
	jdbcTemplate.update(new PreparedStatementCreator() {

	    @Override
	    public PreparedStatement createPreparedStatement(Connection con)
		throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql, new String[] {
			"fixed_deposit_id" });
		ps.setInt(1, fixedDepositdetails.getBankAccountId());
		ps.setDate(2,
			   new java.sql.Date(fixedDepositDetails.getFixedDepositCreationdate()
					     getTime()));
		.....
		return ps;
	    }
	}, keyHolder);

	return keyHolder.getKey().intValue();
    }
    .....
}
