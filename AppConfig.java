public final class AppConfig {

    // 1) Única instancia (Eager Initialization)
    private static final AppConfig instance = new AppConfig();

    // Configuraciones globales de ejemplo
    private String theme;
    private String language;

    // 2) Constructor privado (nadie puede usar: new AppConfig())
    private AppConfig() {
        // Valores por defecto
        this.theme = "Light";
        this.language = "es-MX";
    }

    // 3) Getter público y estático
    public static AppConfig getInstance() {
        return instance;
    }

    // Métodos de configuración
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        if (theme == null || theme.isBlank()) {
            throw new IllegalArgumentException("theme no puede ser null o vacío");
        }
        this.theme = theme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        if (language == null || language.isBlank()) {
            throw new IllegalArgumentException("language no puede ser null o vacío");
        }
        this.language = language;
    }

    public void printConfig() {
        System.out.println("Theme: " + theme + " | Language: " + language);
    }
}
