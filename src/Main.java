import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first string: ");
        String str1 = scan.nextLine();

        int str1Len = str1.length();
        System.out.println("String 1 Length: " + str1Len);

        int halfIndex = str1Len / 2;

        String firstPart = str1.substring(0, halfIndex);
        String otherPart = str1.substring(halfIndex);
        System.out.println("First Half: " + firstPart);
        System.out.println("Second Half: " + otherPart);

        System.out.print("Enter your second string: ");
        String str2 = scan.nextLine();

        int str2Len = str2.length();
        System.out.println("String 2 Length: " + str2Len);

        if (str1Len > str2Len) {
            System.out.println(str1 + " is longer.");
        }   else if (str2Len > str1Len) {
            System.out.println(str2 + " is longer.");
        }   else {
            System.out.println("They are both equal in length.");
        }

        if (str1.equals(str2)) {
            System.out.println("Both strings are the same.");
        }   else {
            int compare = str1.compareTo(str2);
            if (compare < 0) {
                System.out.println(str1 + " comes first alphabetically.");
            }   else {
                System.out.println(str2 + " comes first alphabetically.");
            }
        }

        int indexOfStr2 = str1.indexOf(str2);
            if (indexOfStr2 != -1) {
            System.out.println(str2 + " is found in " + str1 + " at index " + indexOfStr2);
        }   else {
                System.out.println(str2 + " is not found in " + str1 + ".");
            }
    }
}
