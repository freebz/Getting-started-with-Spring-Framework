// 예제 9-4: BankAccountServiceImpl 클래스

@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {
    @Autowired
    private BankAccountDao bankAccountDao;

    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
	if(!isDuplicateAccount(bankAccountDetails)) {
	    return bankAccountDao.createBankAccount(bankAccountDetails);
	} else {
	    throw new BankAccountAlreadyExistsException("Bank account already exists");
	}
    }

    @Override
    public boolean isDuplicateAccount(BankAccountDetails bankAccountDetails) { ..... }
}
