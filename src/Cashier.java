public class Cashier extends Thread {
    private  final OrderQueue newOrders;
    private final OrderQueue toPrepare;

    public  Cashier(OrderQueue newOrders, OrderQueue toPrepare){
        this.newOrders = newOrders;
        this.toPrepare = toPrepare;
    }

    public void run(){
        try{
            while (true) {
                CustomerOrder order = newOrders.getOrder();
                System.out.println("Cashier actepted order #"+order.getid());
                Thread.sleep(4000);
                toPrepare.addOrder(order);
                System.out.println("Order #"+order.getid()+" sent to barista");


            }
        }catch (InterruptedException e) {

        }
    }
}
