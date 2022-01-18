import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<N; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(A);
        Collections.sort(B);
        Collections.reverse(B);

        int answer = 0;

        for(int i = 0; i<N; i++) {
            answer += A.get(i) * B.get(i);
        }
        System.out.println(answer);
    }
}
