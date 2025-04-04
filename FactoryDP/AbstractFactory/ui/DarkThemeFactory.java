package ui;

public class DarkThemeFactory implements ThemeFactory {
    public Button createButton() {
        return new DarkButton();
    }
    public TextBox createTextBox() {
        return new DarkTextBox();
    }
}