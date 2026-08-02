package Tasks;

import java.util.Scanner;

public class Task1 {
    // do something for task1
    StringBuilder sb;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        System.out.println((new StringBuilder(word)
        .reverse().toString()
        .equals(word)?"Yes P":"not P"));
    }
}
