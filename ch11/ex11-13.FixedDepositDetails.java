// 예제 11-13: FixedDepositDetails 클래스

package sample.spring.chapter11.domain;

import java.util.Date;

public class FixedDepositDetails {
    .....
    private long depositAmount;
    private Date maturityDate;
    .....
    public void setDepositAmount(long depositAmount) {
	this.depositAmount = depositAmount;
    }
    public void setMaturityDate(Date maturityDate) {
	this.maturityDate = maturityDate;
    }
    .....
}
