import java.util.LinkedList;

public class OrderQueue {
    private  final LinkedList<CustomerOrder> queue = new LinkedList<>();

    public synchronized  void addOrder(CustomerOrder order){
        queue.add(order);
        notifyAll();
    }

    public synchronized  CustomerOrder getOrder() throws  InterruptedException {
        while (queue.isEmpty()) wait();
        return queue.removeFirst();
    }
}
