package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class Main15649 {
    private static int[] array;
    private static boolean[] check;
    private static int N;
    private static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[N];
        check = new boolean[N+1];
        solve(0, M);
    }
    private static void solve(int index, int length){
        if(index==length){
            for(int i=0; i<M; i++) System.out.print(array[i]+" ");
            System.out.println();
            return;
        }
        for(int i=1; i<=N; i++){
            if(check[i]) continue;
            check[i] = true;
            array[index] = i;
            solve(index+1, length);
            check[i] = false;
        }
    }
}
