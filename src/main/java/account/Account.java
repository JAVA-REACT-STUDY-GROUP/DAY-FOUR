package account;

public abstract  class Account {
    String owner;
    String accountNumber;
    double balance;

    abstract double limit();

}
