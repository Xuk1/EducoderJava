package step1;

import java.util.Scanner;

public class Roster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        String roster1 = scanner.nextLine();
        String roster2 = scanner.nextLine(); 
        int len1 = roster1.length();
        int len2 = roster2.length();
        System.out.println(len1);
        System.out.println(len2);
        if(roster1.compareTo(roster2) == 0){
            System.out.println("相同");
        }else{
            System.out.println("不相同");
        }
        /********** End *********/
    }
}
