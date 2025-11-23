public class CustomerOrder {
    private static int counter = 0;
    private final int id;
    private final String drink;

    public CustomerOrder(String drink) {
        this.id = ++counter;
        this.drink = drink;
    }

    public int getid(){
        return id;
    }

    public String getdrink(){
        return drink;
    }


}
