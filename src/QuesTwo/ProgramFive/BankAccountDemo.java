package QuesTwo.ProgramFive;
// BankAccountDemo.java
public class BankAccountDemo {
    public static void main(String[] args) {
        // 创建一个银行账户，初始余额为 1000
        BankAccount account = new BankAccount(1000);

        // 存款
        account.deposit(500);

        // 取款
        try {
            account.withdraw(1600); // 尝试取款 1600
        } catch (InsufficientFundsException e) {
            // 捕获并处理 InsufficientFundsException
            System.err.println("捕获到异常: " + e.getMessage());
        }

        // 再次取款
        try {
            account.withdraw(800); // 尝试取款 800
        } catch (InsufficientFundsException e) {
            System.err.println("捕获到异常: " + e.getMessage());
        }

        // 输出最终余额
        System.out.println("最终余额: " + account.getBalance());
    }
}