package account;

public class CurrentAccount extends Account{
    AccountType accountType = AccountType.CURRENT_ACCOUNT;
    @Override
    double limit() {
        return 10000;
    }
}
