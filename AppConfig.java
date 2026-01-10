public class AppConfig {

    // Instancia única, privada, estática y final
    private static final AppConfig instance = new AppConfig();

    // Configuraciones globales de la aplicación
    private String theme;
    private String language;

    // 2️Constructor PRIVADO
    private AppConfig() {
        this.theme = "Light";
        this.language = "ES";
    }

    //  Método público para acceder a la instancia
    public static AppConfig getInstance() {
        return instance;
    }

    // Métodos getter y setter
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
