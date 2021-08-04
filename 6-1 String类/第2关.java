package step2;

import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        String data = scanner.next();
        String name = scanner.next();
        int count = 0;
        for(int i=0; i<data.length(); i++){
            if(data.indexOf(name) != -1){
                int index = data.indexOf(name);
                System.out.println(index + count);
                data = data.substring(index+2);
                count = index+2+count;
            }
        }

        /********** End *********/
    }
}
