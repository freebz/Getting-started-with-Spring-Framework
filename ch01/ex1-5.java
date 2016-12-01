// 예제 1-5: JDBC Connection 객체를 사용해 프로그래밍 방식으로 데이터베이스 트랜잭션 관리

import java.sql.Connection;
import java.sql.SQLException;

public class FixedDepositService {
    public FixedDepositDetails getFixedDepositDetails( ..... ) { ..... }

    public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
	Connection con = ..... ;
	try {
	    con.setAutoCommit(false);
	    //-- 데이터베이스 테이블을 수정하는 SQL 문 실행
	    con.commit();
	} catch(SQLException sqle) {
	    if(con != null) {
		con.rollback();
	    }
	}
	//.....
    }
}
