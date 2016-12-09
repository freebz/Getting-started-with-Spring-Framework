// 예제 11-27: FixedDepositDetails - JSR 303 제약 조건 지정

package sample.spring.chapter11.domain;

import javax.validation.constraints.*;

public class FixedDepositDetails {
    private ling id;

    @Min(1000)
    @Max(500000)
    private long depositAmount;

    @Email
    @Size(min=10, max=25)
    private String email;

    @NotNull
    private Date maturityDate;
    .....
}
