package rt4.example.Partie5;

import java.util.ArrayList;
import java.util.List;

public class Category implements CatalogComponent {

    private String name;
    private List<CatalogComponent> components;

    public Category(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void add(CatalogComponent component) {
        components.add(component);
    }

    public void remove(CatalogComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        display("");
    }

    private void display(String indentation) {
        System.out.println(indentation + name);

        for (CatalogComponent component : components) {

            if (component instanceof Category category) {
                category.display(indentation + "  ");
            } else {
                System.out.print(indentation + "  ");
                component.display();
            }
        }
    }
}