import java.util.Optional;

public class NotNull {
    public static void main(String[] args) {
        String possiblyNullString = "Optional";
        Optional<String> optionalString = Optional.of(possiblyNullString);

        String value = optionalString.get();
        System.out.println("Value: " + value);
    }
}
