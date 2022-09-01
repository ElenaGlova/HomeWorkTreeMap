import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List<Person> notables = new ArrayList<>(List.of(
                new Person("Lena", "Petrova-Vodkina", 12),
                new Person("Svetlana", "Mariinova-Tolstova-Mechnik", 16),
                new Person("Sergey", "Luchev-Vetlitskiy", 13),
                new Person("Mikhail", "Veschev-Ryinochkin", 18),
                new Person("Valeriy", "Obramovich", 20),
                new Person("Ivan", "Zhvanetskiy", 13)
        ));
        Predicate<Person> predicate = person -> person.getAge() < 18;
        notables.removeIf(predicate);
        Collections.sort(notables, new ComparePerson());
        System.out.println(notables);
    }
}
