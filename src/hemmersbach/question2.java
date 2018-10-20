package hemmersbach;

public class question2 {

    public static void main( String[] args ) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }

    public static class TextInput {
        private String currentValue;

        public void add( char c ) {
            if (Character.isLetter(c)) {
                getValue();
            }
        }

        public String getValue() {
            return this.currentValue;
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add( char c ) {

        }
    }
}
