import java.util.Vector;

enum Gender {
    BOY, GIRL
}

class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return gender == Gender.BOY ? "B" : "G";
    }
}

public class problem5 {
    private Vector<Person> line;

    public problem5() {
        this.line = new Vector<>();
    }

    public void kidnap(Person p) {
        line.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boysWaitingForGirls = 0;

        for (Person p : line) {
            if (p.getGender() == Gender.BOY) {
                boysWaitingForGirls++;
            } else {
                if (boysWaitingForGirls > 0) {
                    boysWaitingForGirls--;
                } else {
                    return true;
                }
            }
        }

        return boysWaitingForGirls > 0;
    }

    @Override
    public String toString() {
        return "Line: " + line.toString();
    }

    public static void main(String[] args) {
        problem5 test1 = new problem5();
        test1.kidnap(new Person(Gender.BOY));
        test1.kidnap(new Person(Gender.BOY));
        test1.kidnap(new Person(Gender.GIRL));
        test1.kidnap(new Person(Gender.GIRL));

        System.out.println("Test 1 (BBGG): " + test1);
        System.out.println("Will dragon eat? " + (test1.willDragonEatOrNot() ? "Yes" : "No"));

        System.out.println("---------------------------");

        problem5 test2 = new problem5();
        test2.kidnap(new Person(Gender.GIRL));
        test2.kidnap(new Person(Gender.BOY));
        test2.kidnap(new Person(Gender.GIRL));
        test2.kidnap(new Person(Gender.BOY));

        System.out.println("Test 2 (GBGB): " + test2);
        System.out.println("Will dragon eat? " + (test2.willDragonEatOrNot() ? "Yes" : "No"));

        System.out.println("---------------------------");

        problem5 test3 = new problem5();
        test3.kidnap(new Person(Gender.BOY));
        test3.kidnap(new Person(Gender.GIRL));
        test3.kidnap(new Person(Gender.BOY));
        test3.kidnap(new Person(Gender.GIRL));

        System.out.println("Test 3 (BGBG): " + test3);
        System.out.println("Will dragon eat? " + (test3.willDragonEatOrNot() ? "Yes" : "No"));
    }
}