import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int j = 0; j <= n; j++){ 
            String text = scan.next();
             for(int i = 0; i < text.length(); i++){
                if(i%2 == 0){
                    System.out.print(text.charAt(i));
                } 
            }
            System.out.print(" ");
            for(int i = 0; i < text.length(); i++){
                if(i%2 != 0){
                    System.out.print(text.charAt(i));
                }
            }
            System.out.println();
        }
    }
}