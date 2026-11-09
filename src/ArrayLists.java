import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            ages.add(random.nextInt(101));
        }

        List<Integer> adults = ages.stream()
                .filter(age -> age >= 18)
                .sorted()
                .collect(Collectors.toList());

        adults.forEach(System.out::println);
    }
}
