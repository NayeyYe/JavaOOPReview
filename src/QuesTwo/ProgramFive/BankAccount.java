package QuesTwo.ProgramFive;

public class BankAccount {
    private double balance;

    // 构造方法
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // 存款方法
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功，当前余额：" + balance);
        }else{
            System.out.println("存款金额必须大于0");
        }
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // 如果余额不足， 抛出异常InsufficientFundsException
            throw new InsufficientFundsException("余额不足，当前余额：" + balance);
        }else{
            balance -= amount;
            System.out.println("取款成功，当前余额：" + balance);
        }
    }

    public double getBalance() {

        return balance;
    }
}
