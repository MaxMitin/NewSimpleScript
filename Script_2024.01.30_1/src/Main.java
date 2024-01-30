// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main{public static void main(String[] arg){
    enterNumber();
    System.out.println("");
    enterWord();
}

private static void enterNumber(){
    System.out.println("Enter a number!");
    Scanner sc = new Scanner(System.in);
    int scnumber = sc.nextInt();
    int a = 10;
    if (scnumber != a){
        System.out.println("That's wrong number!");
    }
    else {
        System.out.println("That's right number!");
    }
}

private static void enterWord() {
    System.out.println("Enter a word!");
    Scanner sc = new Scanner(System.in);
    String scword = sc.next();
    String a = "Hello";
    if (scword.equals(a)){
        System.out.println("That's right word!");
    }
    else {
        System.out.println("That's wrong word!");
    }
}
}