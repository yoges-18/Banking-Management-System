import java.util.Scanner;

public class BankingManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = null;
        Customer customer = null;

        while (true) {

            System.out.println("\n=================================");
            System.out.println("   BANKING MANAGEMENT SYSTEM");
            System.out.println("=================================");

            System.out.println("1. Create Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Update Account Details");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // Create Account
                case 1:

                    if (customer != null) {
                        System.out.println("Account already exists.");
                        break;
                    }

                    System.out.print("Enter account number: ");
                    int accountNumber = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter address: ");
                    String address = sc.nextLine();

                    account = new BankAccount(accountNumber);

                    customer = new Customer(
                            name,
                            phone,
                            address,
                            account
                    );

                    System.out.println(
                            "Account created successfully."
                    );

                    break;


                // Display Account
                case 2:

                    if (customer == null) {
                        System.out.println(
                                "Please create an account first."
                        );
                    }
                    else {
                        customer.displayDetails();
                    }

                    break;


                // Deposit
                case 3:

                    if (account == null) {
                        System.out.println(
                                "Please create an account first."
                        );
                    }
                    else {

                        System.out.print(
                                "Enter amount to deposit: "
                        );

                        double depositAmount = sc.nextDouble();

                        account.deposit(depositAmount);
                    }

                    break;


                // Withdraw
                case 4:

                    if (account == null) {
                        System.out.println(
                                "Please create an account first."
                        );
                    }
                    else {

                        System.out.print(
                                "Enter amount to withdraw: "
                        );

                        double withdrawAmount = sc.nextDouble();

                        account.withdraw(withdrawAmount);
                    }

                    break;


                // Check Balance
                case 5:

                    if (account == null) {
                        System.out.println(
                                "Please create an account first."
                        );
                    }
                    else {

                        System.out.println(
                                "Current Balance: "
                                + account.getBalance()
                        );
                    }

                    break;


                // Update Account
                case 6:

                    if (customer == null) {

                        System.out.println(
                                "Please create an account first."
                        );
                    }
                    else {

                        sc.nextLine();

                        System.out.print(
                                "Enter new phone number: "
                        );

                        String newPhone = sc.nextLine();

                        System.out.print(
                                "Enter new address: "
                        );

                        String newAddress = sc.nextLine();

                        customer.setPhone(newPhone);
                        customer.setAddress(newAddress);

                        System.out.println(
                                "Account details updated successfully."
                        );
                    }

                    break;


                // Exit
                case 7:

                    System.out.println(
                            "Thank you for using Banking Management System."
                    );

                    sc.close();

                    return;


                // Invalid choice
                default:

                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }
        }
    }
}
