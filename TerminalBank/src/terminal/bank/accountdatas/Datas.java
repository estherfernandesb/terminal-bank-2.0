package terminal.bank.accountdatas;
import java.util.Scanner;

//Classe de armazenamento de dados
public class Datas {
    private String name;
    private String email;
    private double balance;
    private int operations = 0;
    private boolean accountType = true;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAccountType() {
        return accountType;
    }

    public void setAccountType(boolean accountType) {
        this.accountType = accountType;
    }

    public void displaysProcess() {
        Scanner readingDatas = new Scanner(System.in);

        System.out.println("Insert your balance: ");
        double balance = readingDatas.nextDouble();

        System.out.println("Operations:");
        String menu = """
                1- Check Balance
                2- Value Transfer
                3- Receive Value
                4- Exit
                """;

        while (operations != 4) {
            System.out.println(menu);
            operations = readingDatas.nextInt();

            if (operations == 1) {
                System.out.println("Current balance: " + balance);
            } else if (operations == 2) {
                System.out.println("Insert the transfer value: ");
                double transferValue = readingDatas.nextDouble();
                System.out.println("Transferred value: " + transferValue);
                if (transferValue > balance) {
                    System.out.println("You can't make this transfer.");
                } else {
                    balance -= transferValue;
                    System.out.println("Transfer success!");
                }
            } else if (operations == 3) {
                System.out.println("Insert the receive value: ");
                double receiveValue = readingDatas.nextDouble();
                balance += receiveValue;
                System.out.println("Receive sucess!");
            } else if (operations != 4) {
                System.out.println("This operation is unavailable.");
            }

        }
    }
}

