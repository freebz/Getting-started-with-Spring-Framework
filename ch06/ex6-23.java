// 예제 6-23: FixedDepositDetails 클래스

package sample.spring.chapter06.bankapp.domian;

public class FixedDepositDetails {
    private long id;
    private float depositAmount;
    private int tenure;
    private String email;

    public FixedDepositDetails(long id, float depositAmount, int tenure,
          String email) {
	this.id = id;
	this.depositAmount = depositAmount;
	this.tenure = tenure;
	this.email = email;
    }
    .....
    //-- 인스턴스 변수를 위한 게터 및 세터 메서드
    public float getDepositAmount() {
	return depositAmount;
    }
    .....
}
