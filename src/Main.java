import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> notables = new ArrayList<>(List.of(
                new Person("Lena", "Petrova-Vodkina", 12),
                new Person("Svetlana", "Mariinova-Tolstova-Mechnik", 16),
                new Person("Sergey", "Luchev-Vetlitskiy", 13),
                new Person("Ivan", "Zhvanetskiy", 13)
        ));
        Comparator<Person> compPerson = Main::comparatorMet;

        Collections.sort(notables, compPerson);

        System.out.println(notables);
    }
    public static int comparatorMet(Person p1, Person p2){
        String[] perOneSurname = p1.getSurname().split("-");
        String[] perTwoSurname = p2.getSurname().split("-");
        if (perOneSurname.length > perTwoSurname.length) {
            return -1;
        } else if (perOneSurname.length < perTwoSurname.length) {
            return 1;
        } else if (p1.getAge() > p2.getAge()) {
            return -1;
        } else if (p1.getAge() < p2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
