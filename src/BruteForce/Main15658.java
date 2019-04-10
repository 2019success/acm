package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class Main15658 {
    private static int N;
    private static int[] array;
    private static int max;
    private static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        N = Integer.parseInt(br.readLine());
        array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) array[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int addCount=Integer.parseInt(st.nextToken());
        int minusCount=Integer.parseInt(st.nextToken());
        int mulCount=Integer.parseInt(st.nextToken());
        int divCount=Integer.parseInt(st.nextToken());
        solve(array[0], 1, addCount, minusCount, mulCount, divCount);
        bw.write(max+"\n");
        bw.write(min+"\n");
        bw.close();
    }
    private static void solve(int currAnaswer, int index, int addCount, int minusCount, int mulCount, int divCount){
        if(addCount<0 || minusCount<0 || mulCount<0 || divCount<0 ) return;
        if(index==N){
            if(currAnaswer > max) max = currAnaswer;
            if(currAnaswer< min) min = currAnaswer;
        }
        else{
            solve(currAnaswer+array[index], index+1, addCount-1, minusCount, mulCount, divCount);
            solve(currAnaswer-array[index], index+1, addCount, minusCount-1, mulCount, divCount);
            solve(currAnaswer*array[index], index+1, addCount, minusCount, mulCount-1, divCount);
            solve(currAnaswer/array[index], index+1, addCount, minusCount, mulCount, divCount-1);
        }
    }
}
