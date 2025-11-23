public class Waiter extends Thread{
    private  final OrderQueue readyOrders;

    public  Waiter(OrderQueue readyOrders){
        this.readyOrders = readyOrders;
    }

    @Override
    public void run() {
        try {
            while (true) {
                CustomerOrder order = readyOrders.getOrder();
                System.out.println("Waiter delivered order #"+order.getid());
                Thread.sleep(2000);
            }
        }catch (InterruptedException e) {}

    }
}
