import java.util.function.BinaryOperator;

public class Sum {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = Integer::sum;
        int sum = add.apply(5,10);
        System.out.println(sum);
    }
}
