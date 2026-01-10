public class Main {

    public static void main(String[] args) {

        // Obtener la primera referencia
        AppConfig config1 = AppConfig.getInstance();
        config1.setTheme("Dark");

        // Obtener la segunda referencia
        AppConfig config2 = AppConfig.getInstance();

        // Verificar si son la misma instancia
        System.out.println("¿config1 == config2? " + (config1 == config2));

        // Mostrar valores
        System.out.println("Tema desde config2: " + config2.getTheme());
        System.out.println("Idioma: " + config2.getLanguage());
    }
}
