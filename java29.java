package java29;

import java.util.Scanner;

public class java29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, top;
        System.out.print("seri sayısı: ");
        a = input.nextInt();
        int temp = 1, onceki = 0;
        for(int i=0; i<a; i++){
            top = temp + onceki;
            System.out.println(top);
            onceki = temp;
            temp = top;
        }
        input.close();
    }
}
