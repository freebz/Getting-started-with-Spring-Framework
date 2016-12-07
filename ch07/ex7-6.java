// 예제 7-6: FixedDepositDaoImpl 클래스 - NamedParameterJdbcTemplate 사용

package sample.spring.chapter07.bankapp.dao;

import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
.....
@Repository(value = "FixedDepositDao")
public class FixedDepositDaoImpl implements FixedDepositDao {
    .....
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    .....
    public FixedDepositDetails getFixedDeposit(final int FixedDopositId) {
	final String sql = "select * from fixed_deposit_details where fixed_deposit_id = :FixedDepositId";

	SqlParameterSource namedParameters = new MapSqlParameterSource(
            "FixedDepositId", FixedDepositId);

	return namedParameterJdbcTemplate.queryForObject(sql, namedParameters,
            new RowMapper<FixedDepositDetails>() {
		public FixedDepositDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		    FixedDepositDetails fixedDepositDetails = new FixedDepositDetails();
		    fixedDepositDetails.setActive(rs.getString("active"));
		    .....
		    return fixedDepositDetails;
		}
	    });
    }
}
