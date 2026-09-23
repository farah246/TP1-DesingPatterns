package rt4.example.Partie5CompositePattern;

public class Main {

    public static void main(String[] args) {

        // Catalogue
        Category catalogue = new Category("Catalogue");

        // Categories
        Category books = new Category("Books");
        Category electronics = new Category("Electronics");
        Category clothing = new Category("Clothing");

        // Products
        Product book1 = new Product("Book 1");
        Product book2 = new Product("Book 2");

        Product laptop = new Product("Laptop");
        Product smartphone = new Product("Smartphone");

        Product shirt = new Product("Shirt");
        Product jacket = new Product("Jacket");

        // Ajouter les produits aux catégories
        books.add(book1);
        books.add(book2);

        electronics.add(laptop);
        electronics.add(smartphone);

        clothing.add(shirt);
        clothing.add(jacket);

        // Ajouter les catégories au catalogue
        catalogue.add(books);
        catalogue.add(electronics);
        catalogue.add(clothing);

        // Afficher tout le catalogue
        catalogue.display();
    }
}