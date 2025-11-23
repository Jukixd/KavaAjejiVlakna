import java.util.Random;

public class CustomerGen extends Thread{

    private final OrderQueue oq;
    private final String[] drinks = {"Espresso","Latte","Cappucino","Tea"};
    private final Random rn = new Random();



    public CustomerGen(OrderQueue oq){
        this.oq = oq;
    }

    public void run(){
        try {
            for (int i = 0; i < 2; i++) {
                String drink = drinks[rn.nextInt(drinks.length)];
                CustomerOrder order = new CustomerOrder(drink);
                oq.addOrder(order);
                System.out.println("Customer ordered: " + order.getdrink() + " #" + order.getid());

                Thread.sleep(3000);
            }
        }catch (InterruptedException e) {}
    }
}
