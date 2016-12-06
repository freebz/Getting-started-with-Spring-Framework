// 예제 6-1: FixedDepositServiceImpl 클래스 - @Service 어노테이션 사용

package sample.spring.chapter06.bankapp.service;

import org.springframework.stereotype.Service;

@Service(value="FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService { ..... }
