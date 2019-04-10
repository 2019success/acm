package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class Main15650 {
    private static int N;
    private static int M;
    private static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[M];
        solve(1,0);
    }
    private static void solve(int index, int currCount){
        if(currCount==M){
            for(int i=0; i<M; i++) System.out.print(array[i]+ " ");
                System.out.println();
            return;
        }
        if(index>N) return;
        array[currCount] = index;
        solve(index+1, currCount+1);
        array[currCount] = 0;
        solve(index+1, currCount);

    }
}
