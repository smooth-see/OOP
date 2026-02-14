import java.util.Scanner;

enum UserRole {
    ADMIN, USER, GUEST
}

public class problem2 {
    //(non-final) модификатор
    private static int count = 0;

    //(non-static) поле (read-only)
    private final String id;

    private String firstName;
    private String lastName;
    private UserRole role;

    {
        count++;
    }

    public problem2(String id, String firstName, String lastName, UserRole role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String fullName(boolean upper) {
        String name = fullName();
        return upper ? name.toUpperCase() : name;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter id: ");
        String id = input.next();

        System.out.print("Enter first name: ");
        String f = input.next();

        System.out.print("Enter last name: ");
        String l = input.next();

        problem2 user = new problem2(id, f, l, UserRole.USER);

        System.out.println("Full name: " + user.fullName(true));
        System.out.println("Role: " + user.role);
        System.out.println("Users created: " + problem2.getCount());

        input.close();
    }
}