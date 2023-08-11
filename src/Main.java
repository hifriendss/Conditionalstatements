//arrays
/*public class Main {
    public static void main(String[] args) {
        int number=10;
        int[] num=new int[5];
        System.out.println(num[1]);
        }
    } */



//arrays with for loop
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array  ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the number at index :" + i);
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("The element at index :" + i + " is :" + numbers[i]);
        }
    }
}*/




//conditional statements
//if
/*public class Main {
    public static void main(String args[]) {
        int i = 10;
        if (i>=5)
            System.out.println(i+" is greater than 5");
    }
}*/




//conditional statements
//if else
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        if (n>0) {
            System.out.println("The number is positive.");
        }
        else {
            System.out.println("The number is not positive.");
        }
    }
}*/


//conditional statements
//else if
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score ");
        int score = sc.nextInt();
        if (score >= 70) {
            System.out.println("Grade A");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade B");
        } else if (score >= 50 && score < 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}