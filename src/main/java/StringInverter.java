public class StringInverter implements StringTransformer {
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder inverted = new StringBuilder();
        inverted.append(text).reverse();
        drink.setText(inverted.toString());
    }
}
