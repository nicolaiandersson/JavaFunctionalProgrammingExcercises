@FunctionalInterface
interface Converter {
    String convert(int number);
}

public class IntegertoString {
    public static void main(String[] args) {
        Converter converter = (String::valueOf);

        String result = converter.convert(10);
        System.out.println(result);
    }
}
