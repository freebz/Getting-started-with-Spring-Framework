// 예제 6-27: FixedDepositDetails 클래스 - JSR 303 어노테이션

package sample.spring.chapter06.bankapp.domain;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.NotBlank;

public class FixedDepositDetails {
    @NotNull
    private long id;

    @Min(1000)
    @Max(500000)
    private float depositAmount;

    @Min(6)
    private int tenure;

    @NotBlank
    @Size(min=5, max=100)
    private String email;

    public FixedDepositDetails(long id, float depositAmount, int tenure, String email) {
	this.id = id;
	this.depositAmount = depositAmount;
	this.tenure = tenure;
	this.email = email;
    }
    .....
}
