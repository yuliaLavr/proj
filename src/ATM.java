public class ATM {
    public int balance;

    public ATM(int balance) {
        this.balance = balance;
    }
    public synchronized void withdraw(int sum){
        if(sum<=balance){
            balance-=sum;
            System.out.println(Thread.currentThread().getName() +"зняв кошти: "+ sum+"грн. Залишилось: "+balance+"грн");
        }
        else{
            System.out.println(Thread.currentThread().getName()+ "недостатньо коштів: "+ sum +"грн. Баланс банкомату: "+balance+"грн");
        }
    }
}
