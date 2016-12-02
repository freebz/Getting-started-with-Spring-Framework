// 예제 3-4: PersonalBankingServiceImpl 클래스

package sample.spring.chapter03.bankapp.service;

public class PersonalBankingServiceImpl extends ServiceTemplate implements
        PersonalBankingService {

    private PersonalBankingDao personalBankingDao;

    public void setPersonalBankingDao(PersonalBankingDao personalBankingDao) {
	this.personalBankingDao = personalBankingDao;
    }

    @Override
    public BankStatement getMiniStatement() {
	return personalBankingDao.getMiniStatement();
    }
}
