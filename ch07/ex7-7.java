// 예제 7-7: BankAccountDaoImpl 클래스 - SimpleJdbcInsert 사용

package sample.spring.chapter07.bankapp.dao;

import java.sql.DataSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
.....
@Repository(value = "bankAccountDao")
public class BankAccountDaoImpl implements BankAccountDao {
    private SimpleJdbcInsert insertBankAccountDetail;
    
    @Autowired
    private void setDataSrouce(DataSource dataSource) {
	this.insertBankAccountDetail = new SimpleJdbcInsert(dataSource)
	    .withTableName("bank_account_details")
	    .usingGeneratedKeyColumns("account_id");
    }

    @Override
    public int createBankAccount(final BankAccountDetails bankAccountDetails) {
	Map<String, Object> parameters = new HashMap<String, Object>(2);
	parameters.put("balance_amount", bankAccountDetails.getBalanceAmount());
	parameters.put("last_transaction_ts", new java.sql.Date(
            bankAccountDetails.getLastTransactionTimestamp().getTime()));

	Number key = insertBankAccountDetail.executeAndReturnKey(parameters);
	return key.intValue();
    }
    .....
}
