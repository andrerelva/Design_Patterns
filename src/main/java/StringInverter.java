public class StringInverter implements StringTransformer {
    public void execute(StringDrink drink) {
        char[] text = drink.getText().toCharArray();
        StringBuilder inverted = new StringBuilder();
        for (int i = text.length - 1; i >= 0; i--) {
            inverted.append(text[i]);
        }
        drink.setText(inverted.toString());
    }
}
