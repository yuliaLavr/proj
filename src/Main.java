//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATM bankomat=new ATM(1000);
        Client client1=new Client(400,bankomat);
        Client client2=new Client(500,bankomat);
        Client client3=new Client(200,bankomat);

        client1.setName("Клієнт 1:");
        client2.setName("Клієнт 2:");
        client3.setName("Клієнт 3:");

        client1.start();
        client2.start();
        client3.start();
    }
}