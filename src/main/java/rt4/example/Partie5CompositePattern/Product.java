package rt4.example.Partie5CompositePattern;

public class Product implements CatalogComponent {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("- " + name);
    }
}