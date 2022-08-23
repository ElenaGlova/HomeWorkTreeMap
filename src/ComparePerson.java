import java.util.Comparator;

public class ComparePerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String[] thisSurname = o1.getSurname().split("-");
        String[] personSurname = o2.getSurname().split("-");
        if (thisSurname.length > personSurname.length) {
            return -1;
        } else if (thisSurname.length < personSurname.length) {
            return 1;
        } else if (o1.getAge() > o2.getAge()) {
            return -1;
        } else if (o1.getAge() < o2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
