
package second;


public class Second {

static class CreditCard {


    private String customer;  
    private String bank;      
    private String account;  
    private int limit;        
    private double balance;   

    public  CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0); 
    }

    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }


    public boolean charge(double price) {
        if (price + balance > limit) { 
            return false;             
   
        }
        balance += price;             
        return true;                  
    }

    public void makePayment(double amount) {
        balance -= amount;           
    }

    public void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);
    }
}

static class PredatoryCreditCard extends CreditCard {

    private double penaltyFee; 

    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double penalty) {
        super(cust, bk, acnt, lim, initialBal); 
        this.penaltyFee = penalty;
    }

    @Override
    public boolean charge(double price) {
        boolean isSuccess = super.charge(price); 
        if (!isSuccess) {
            super.charge(penaltyFee); 
        }
        return isSuccess;
    }
}


    public static void main(String[] args) {
        // إنشاء كائن من CreditCard
        CreditCard card1 = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000, 3000);
         CreditCard.printSummary(card1);
        System.out.println();

        // إنشاء كائن من PredatoryCreditCard
        PredatoryCreditCard card2 = new PredatoryCreditCard("Jane Doe", "Bank of America", "1234 5678 9012 3456", 2000, 500, 50);
        CreditCard.printSummary(card2);
        System.out.println();

        // اختبار عملية ناجحة
        System.out.println("Charging $1000...");
        System.out.println("Charge successful: " + card2.charge(1000));
        CreditCard.printSummary(card2);

        // اختبار عملية تفشل وتطبيق غرامة
        System.out.println("\nCharging $2000...");
        System.out.println("Charge successful: " + card2.charge(2000));
        CreditCard.printSummary(card2);
    }
}


