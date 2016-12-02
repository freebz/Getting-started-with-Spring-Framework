// 예제 3-24: 다양한 형식의 속성을 포함하는 BankDetails 클래스

package sample.spring.chapter03.beans;
.....
public class BankDetails {
    private String bankName;
    private byte[] bankPrimaryBusiness;
    private char[] headOfficeAddress;
    private char privateBank;
    private Currency primaryCurrency;
    private Date dateOfInception;
    private Properties branchAddress;
    .....
    
    public void setBankName(String bankName) {
	this.bankName = bankName;
    }
    //-- 다른 세터 메서드
}
