import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int M, N, answer;
    static char[][] arr;
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x,y));
        while(!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Point p = Q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];
                    if(nx >= 0 && nx < N && ny >= 0 && ny < M && (arr[nx][ny] == 'P' || arr[nx][ny] == 'O')) {
                        if(arr[nx][ny] == 'P') {
                            answer++;
                        }
                        arr[nx][ny] = 'C';
                        Q.offer(new Point(nx,ny));
                    }

                }

            }

        }

    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 'I') {
                    T.BFS(i,j);
                }
            }
        }
        if(answer > 0) {
            System.out.println(answer);
        } else {
            System.out.println("TT");
        }



    }
}


