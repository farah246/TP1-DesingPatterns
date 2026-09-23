package rt4.example.Partie8Architecture.infrastructure.config;

public class ApplicationConfig {

    private String databaseUrl;
    private String applicationName;

    // Constructeur privé
    private ApplicationConfig() {
    }

    // Instance unique
    private static ApplicationConfig instance;



    // Méthode d'accès à l'unique instance
    public static ApplicationConfig getInstance() {

        if (instance == null) {
            instance = new ApplicationConfig();
        }

        return instance;
    }
    // Getters
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApplicationName() {
        return applicationName;
    }

    // Setters
    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

}