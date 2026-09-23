package rt4.example.Partie3;

import rt4.example.Partie3.ApplicationConfig;

public class SingletonQuickTest {

    public static void main(String[] args) {
/*
        ApplicationConfig c1 = ApplicationConfig.getInstance();
        ApplicationConfig c2 = ApplicationConfig.getInstance();

        System.out.println(c1 == c2);*/

        ApplicationConfig c1 = ApplicationConfig.getInstance();

        c1.setDatabaseUrl("jdbc:mysql://localhost:3306/shop");
        c1.setApplicationName("Online Shop");

        ApplicationConfig c2 = ApplicationConfig.getInstance();

        System.out.println(c1 == c2);
        System.out.println(c2.getDatabaseUrl());
        System.out.println(c2.getApplicationName());
    }
}