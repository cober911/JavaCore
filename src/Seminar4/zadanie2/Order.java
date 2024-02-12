package Seminar4.zadanie2;

public class Order {
    private Client client;
    private Product product;
    private Integer quantity;

    public Order(Client client, Product product, Integer quantity) {
        this.client = client;
        this.product = product;
        this.quantity = quantity;
    }

    public Order() {
    }


    public static Order makeBuy(String firstName, Integer age, String phone, String productName, Integer productCost, Integer quantity){
        Product product = new Product(productName, productCost);
        Client client = new Client(firstName, age, phone);
        return new Order(client, product, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
