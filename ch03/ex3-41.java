// 예제 3-41: BankStatement 클래스

package sample.spring.chapter03.beans;

import java.beans.ConstructorProperties;

public class BankStatement {
    .....
    @ConstructorProperties({ "transactionDate", "amount", "transactionType",
	    "referenceNumber" })
    public BankStatement(Date transactionDate, double amount,
            String transactionType, String referenceNumber) {
	this.transactionType = transactionType;
	this.amount = amount;
	.....
    }
    .....
}
