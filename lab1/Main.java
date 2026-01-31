/////////////////////////////////////////////////////////////////////////////// 1
//public class Main{
//    public static void main(String[] args) {
//        System.out.println("+-----+");
//        System.out.println("|Edige|");
//        System.out.println("+-----+");
//    }
//}
/////////////////////////////////////////////////////////////////////////////// 2
//import java.util.Scanner;
//import java.lang.Math;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("enter num: ");
//
//        int a = scanner.nextInt();
//        double root = Math.sqrt(2);
//
//        System.out.println("the area of a square: " + a * a);
//        System.out.println("the perimetr of a square: " + 4 * a);
//        System.out.println("the diagonal of a square: " + a * root);
//    }
//}
/////////////////////////////////////////////////////////////////////////////// 3
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("enter num: ");
//
//        int a = scanner.nextInt();
//
//        if(a >= 95 && a <= 100 ){
//            System.out.println("ur grade is: A+");
//        } else if(a >= 90 && a <= 94) {
//            System.out.println("ur grade is: A-");
//        } else if(a >= 85 && a <= 89){
//            System.out.println("ur grade is: B+");
//        } else if(a >= 80 && a <= 84){
//            System.out.println("ur grade is: B");
//        } else if(a >= 75 && a <= 79){
//            System.out.println("ur grade is: B-");
//        } else if(a >= 70 && a <= 74){
//            System.out.println("ur grade is: C+");
//        } else if(a >= 65 && a <+ 69){
//            System.out.println("ur grade is: C");
//        } else if(a >= 60 && a <= 64){
//            System.out.println("ur grade is: C-");
//        } else if(a >= 55 && a <= 59){
//            System.out.println("ur grade is: D+");
//        } else if(a >= 50 && a <= 54){
//            System.out.println("ur grade is: D");
//        }
//    }
//}
/////////////////////////////////////////////////////////////////////////////// 4
//import java.util.Scanner;
//import java.lang.Math;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        int D = (b * b) - 4 * a * c;
//
//        if(D > 0){
//            double x = Math.sqrt(D);
//            double x1 = (-b + x) / 2 * a;
//            double x2 = (-b - x) / 2 * a;
//            System.out.println("two real: " + x1 + " and " + x2);
//        } else if(D == 0){
//            double x3 = (-b) / 2 * a;
//            System.out.println("one real: " + x3);
//        } else if(D < 0){
//            System.out.println("no real");
//        }
//    }
//}
/////////////////////////////////////////////////////////////////////////////// 5
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        double balance = scanner.nextInt();
//
//        double percent = scanner.nextInt();
//
//        double percent_balance = balance * percent / 100;
//
//        double final_balance = balance + percent_balance;
//
//        System.out.println("ur balance + interest is: " + final_balance);
//    }
//}
/////////////////////////////////////////////////////////////////////////////// 6
//import java.util.Scanner;
//
//public class Main{
//    public static boolean ispalllindrom(String a){
//        int l = 0;
//        int r = a.length() - 1;
//
//        while(l < r){
//            if(a.charAt(l) != a.charAt(r)){
//                return false;
//            }
//            l++;
//            r--;
//        }
//        return true;
//    }
//
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//
//        if(ispalllindrom(a)){
//            System.out.println("This is a pallindrom");
//        } else{
//            System.out.println("This is not a palliindrom");
//        }
//    }
//}


















