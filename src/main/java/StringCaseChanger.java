public class StringCaseChanger implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        char[] text = drink.getText().toCharArray();
        StringBuilder ret = new StringBuilder();
        for (char c : text) {
            ret.append(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        drink.setText(ret.toString());
    }
}
