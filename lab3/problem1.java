import java.util.Scanner;

class Data {
    private double sum;
    private double max;
    private int cnt;

    public Data() {
        sum = 0;
        cnt = 0;
        max = Double.NEGATIVE_INFINITY;
    }

    public void add(double val) {
        if (cnt == 0 || val > max) {
            max = val;
        }
        sum += val;
        cnt++;
    }

    public double get_avg() {
        if (cnt == 0) return 0;
        return sum / cnt;
    }

    public double get_max() {
        if (cnt == 0) return 0;
        return max;
    }
}

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data dataset = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double num = Double.parseDouble(input);
                dataset.add(num);
            } catch (Exception error) {
                System.out.println("Error! This is not a number. Try again!");
            }
        }

        System.out.println("Average = " + dataset.get_avg());
        System.out.println("Maximum = " + dataset.get_max());
    }

    public static class student_constructor {
        private String name;
        private String id;

        public student_constructor(String name, String id){
            this.name = name;
            this.id = id;
        }

        public String getName(){
            return name;}
        public String getId(){
            return id;}

        @Override
        public String toString(){
            return name + "(id: " + id  + ")";
        }
    }
}