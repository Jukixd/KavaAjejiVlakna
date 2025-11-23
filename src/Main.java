
public class Main {
    public static void main(String[] args) {
        OrderQueue newOrders = new OrderQueue();
        OrderQueue toPrepare = new OrderQueue();
        OrderQueue readyOrders = new OrderQueue();

        new CustomerGen(newOrders).start();
        new Cashier(newOrders,toPrepare).start();
        new Barista(toPrepare,readyOrders).start();
        new Waiter(readyOrders).start();


    }
}