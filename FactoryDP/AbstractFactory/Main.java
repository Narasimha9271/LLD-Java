import ui.*;

public class Main {
    public static void main(String[] args) {
        String theme = "dark";  // Can be "light" or "dark"
        ThemeFactory factory = theme.equals("dark") ? new DarkThemeFactory() : new LightThemeFactory();

        Button button = factory.createButton();
        TextBox textBox = factory.createTextBox();

        button.render();
        textBox.render();
    }
}