import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> notables = new ArrayList<>(List.of(
                new Person("Lena", "Petrova-Vodkina", 12),
                new Person("Svetlana", "Mariinova-Tolstova-Mechnik", 16),
                new Person("Sergey", "Luchev-Vetlitskiy", 13),
                new Person("Ivan", "Zhvanetskiy", 13)
        ));
        Collections.sort(notables, new ComparePerson());
        System.out.println(notables);
    }
}
