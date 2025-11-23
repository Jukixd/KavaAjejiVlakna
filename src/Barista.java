public class Barista extends Thread {
    private  final OrderQueue toPrepare;
    private final OrderQueue readyOrders;

    public Barista(OrderQueue toPrepare, OrderQueue readyOrders){
        this.toPrepare = toPrepare;
        this.readyOrders = readyOrders;
    }

    public void run() {
        try{
            while (true){
                CustomerOrder order = toPrepare.getOrder();
                System.out.println("Barista started preparing order #"+order.getid());
                Thread.sleep(5000);
                readyOrders.addOrder(order);
                System.out.println("Order #"+order.getid()+" is ready");
            }
        }catch (InterruptedException e) {

        }
    }
}
