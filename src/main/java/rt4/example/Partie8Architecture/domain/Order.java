package rt4.example.Partie8Architecture.domain;

public class Order {

    private Product product;
    private String status;

    public Order(Product product) {
        this.product = product;
        this.status = "CREATED";
    }

    public Product getProduct() {
        return product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}