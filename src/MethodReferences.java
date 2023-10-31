import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Anders","John","Messi","Paulo");
        lst.forEach(System.out::println);
    }
}
