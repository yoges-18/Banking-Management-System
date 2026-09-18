import java.util.*;

class User {

    // Private variables - Encapsulation
    private int accNumber;
    private String username;
    private String phno;
    private double balance;
    private String address;

    // Constructor
    public User(int accNumber, String username, String phno,
                double balance, String address) {

        this.accNumber = accNumber;
        this.username = username;
        this.phno = phno;
        this.balance = balance;
        this.address = address;
    }

    // Getter for account number
    public int getAccNumber() {
        return accNumber;
    }

    // Setter for account number
    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for phone number
    public String getPhno() {
        return phno;
    }

    // Setter for phone number
    public void setPhno(String phno) {
        this.phno = phno;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Display user details
    public void displayAccount() {

        System.out.println("ACCOUNT NUMBER : " + accNumber);
        System.out.println("USERNAME       : " + username);
        System.out.println("PHONE NUMBER   : " + phno);
        System.out.println("BALANCE        : " + balance);
        System.out.println("ADDRESS        : " + address);
    }
}


// Database class
class Database {

    private Map<Integer, User> users = new HashMap<>();

    // Add user
    public void addUser(User user) {
        users.put(user.getAccNumber(), user);
    }

    // View account
    public void viewAccount(int accNumber) {

        User user = users.get(accNumber);

        if (user != null) {
            user.displayAccount();
        }
        else {
            System.out.println("USER NOT FOUND");
        }
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Database db = new Database();

        int accNumber = 1000;

        boolean running = true;

        while (running) {

            System.out.println("\n=================================");
            System.out.println("          BANKING SYSTEM");
            System.out.println("=================================");
            System.out.println("1. ADD ACCOUNT");
            System.out.println("2. VIEW ACCOUNT");
            System.out.println("3. EXIT");
            System.out.println("=================================");

            System.out.print("ENTER YOUR CHOICE : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    accNumber++;

                    System.out.print("ENTER YOUR NAME : ");
                    String username = sc.nextLine();

                    System.out.print("ENTER YOUR PHONE NUMBER : ");
                    String phno = sc.nextLine();

                    System.out.print("ENTER YOUR BALANCE : ");
                    double balance = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("ENTER YOUR ADDRESS : ");
                    String address = sc.nextLine();

                    User user = new User(
                            accNumber,
                            username,
                            phno,
                            balance,
                            address
                    );

                    db.addUser(user);

                    System.out.println("\nACCOUNT CREATED SUCCESSFULLY!");
                    System.out.println("YOUR ACCOUNT NUMBER : " + accNumber);

                    break;


                case 2:

                    System.out.print("ENTER ACCOUNT NUMBER : ");
                    int an = sc.nextInt();

                    System.out.println();

                    db.viewAccount(an);

                    break;


                case 3:

                    System.out.println("THANK YOU!");
                    running = false;

                    break;


                default:

                    System.out.println("INVALID CHOICE!");
            }
        }

        sc.close();
    }
}
