import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayLists {
    static void main(String[] args) {
   List<Integer> Age= new ArrayList<>();
   Random Gerador = new Random();

   for (int i = 0; i < 20; i++) {
       Age.add(Gerador.nextInt(101));
   }
    List<Integer> Adults = Age.stream()
            .filter(age -> age >= 18)
            .sorted()
            .collect(Collectors.toList());git ad

        Adults.forEach(age-> System.out.println(age));
    }
}

