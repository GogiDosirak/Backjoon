import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.*;
import java.util.*;



public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       int D = sc.nextInt();
       
       if(A+D > C+B) {
           System.out.println(C+B);
       } else {
           System.out.println(A+D);
       }


    }
}