// 예제 3-19: @ConstructorProperties 어노테이션

package sample.spring.chapter03.bankapp.service;

import java.beans.ConstructorProperties;

public class TransferFundsServiceImpl implements TransferFundsService {

    @ConstructorProperties({"webServiceUrl","active","timeout","numberOfRetrialAttempts"})
    public TransferFundsServiceImpl(String sebServiceUrl, boolean active, long timeout,
        int numberOfRetrialAttempts) { ..... }
}
