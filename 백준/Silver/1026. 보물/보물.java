import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
 public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
     StringTokenizer st = new StringTokenizer(br.readLine());
     for (int i = 0; i < N; i++) {
         A[i] = Integer.parseInt(st.nextToken());
     }

     st = new StringTokenizer(br.readLine());
     for (int i = 0; i < N; i++) {
         B[i] = Integer.parseInt(st.nextToken());
     }
     Arrays.sort(A);
     Arrays.sort(B);
     int answer = 0;
     for (int i = 0; i < N; i++) {
         answer = answer + A[N-i-1] * B[i];
     }

     System.out.println(answer);







    }
}

