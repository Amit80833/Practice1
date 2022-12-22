package ThreadingExamples;
class Customer{
    int amount=10000;

    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw:");
        if (this.amount<amount){
            System.out.println("Insufficient balance");
            System.out.println("Available balance: "+this.amount);
            try {
                wait();
            }catch (Exception e){}
        }
        this.amount-=amount;
        System.out.println("Withdrawl completed");
    }

    synchronized void deposit(int amount){
        System.out.println("going to Deposit:");
        this.amount+=amount;
        System.out.println("Money deposited in the account: "+amount);
        System.out.println("Current balance: "+this.amount);
        notify();
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        final Customer cust = new Customer();
        new Thread(){
            @Override
            public void run() {
                cust.withdraw(12000);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                cust.deposit(13000);
            }
        }.start();
    }
}
