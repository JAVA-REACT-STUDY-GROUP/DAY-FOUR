package account;

public class SavingsAccount extends Account{
    AccountType accountType = AccountType.SAVINGS_ACCOUNT;
    @Override
    double limit() {
            return 5000;
    }
}
