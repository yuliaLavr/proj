public class Client extends Thread{
    public int sum;
    public ATM bankomat;

    public Client(int sum, ATM bankomat) {
        this.sum = sum;
        this.bankomat=bankomat;
    }
    @Override
    public void run(){
       bankomat.withdraw(sum);
    }
}
