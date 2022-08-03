public class AcccountTest {

    public static void main(String[] args) {
	
      Account aman = new Account(1, 0, "Sinchit Batham", "sinchit417@gmail.com", "15240");
      System.out.println(Sinchit.getBalance());
      aman.depositFund(500);
      System.out.println(Sinchit.getBalance()); 
      System.out.println(Sinchit.getEmail()); 
    }
}

public class Bank_Account {
  private double accountNumber = 0;
  private double balance = 0;
  private String customerName = "";
  private String email = "";
  private String phoneNumber;
  public Account(double accNo, double balance, String cName, String email, String pNo){
    this.accountNumber = accNo;
    this.balance = balance;
    this.customerName = cName;
    this.email = email;
    this.phoneNumber = pNo;
  }

  public double getBalance(){
    return balance;
  }

  public String getPhoneNumber(){
    return phoneNumber;
  }

  public double getAccountNumber(){
    return accountNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getEmail() {
    return email;
  }

  public double depositFund(double amount){
    if (amount>0) {
      this.balance += amount;
      return balance;
    }
    System.out.println("Error!");
    return -1;
  }

  public double withdrawFund(double amount){
    if(amount>0 && (this.balance-amount)>0){
      this.balance -= amount;
      return balance;
    }
    System.out.println("Error!");
    return -1;
  }
}
}
