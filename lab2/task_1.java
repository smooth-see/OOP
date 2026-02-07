class Student {
    private String name;
    private String id;
    private int year_of_study;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.year_of_study = 3;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYear_of_study() {
        return year_of_study;
    }

    public void INC_year() {
        if (this.year_of_study < 4) {
            this.year_of_study++;
            System.out.println(name + " transfered to " + year_of_study + " course");
        } else {
            System.out.println("Error: " + name + " is already on final year");
        }
    }
}


public class task_1{
    public static void main(String[] args){
        Student st = new Student("Antony Soprano", "24B032009");

        System.out.println("Student " + st.getName());
        System.out.println("ID: " + st.getId());
        System.out.println("Course: " + st.getYear_of_study());

        st.INC_year();

        System.out.println("New course: " + st.getYear_of_study());
    }
}