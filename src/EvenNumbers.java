import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        arr.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
    }
}
