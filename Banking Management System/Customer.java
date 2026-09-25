public class Customer {

    private String name;
    private String phone;
    private String address;
    private BankAccount account;

    // Constructor
    public Customer(String name, String phone, String address,
                    BankAccount account) {

        this.name = name;
        this.phone = phone;
        this.address = address;
        this.account = account;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get phone
    public String getPhone() {
        return phone;
    }

    // Get address
    public String getAddress() {
        return address;
    }

    // Get account
    public BankAccount getAccount() {
        return account;
    }

    // Update phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Update address
    public void setAddress(String address) {
        this.address = address;
    }

    // Display customer details
    public void displayDetails() {

        System.out.println("\n===== CUSTOMER DETAILS =====");

        System.out.println("Name          : " + name);
        System.out.println("Phone         : " + phone);
        System.out.println("Address       : " + address);
        System.out.println("Account Number: "
                + account.getAccountNumber());
        System.out.println("Balance       : "
                + account.getBalance());
    }
}
