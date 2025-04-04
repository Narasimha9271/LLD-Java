package ui;

public class LightThemeFactory implements ThemeFactory {
    public Button createButton() {
        return new LightButton();
    }
    public TextBox createTextBox() {
        return new LightTextBox();
    }
}