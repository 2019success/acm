package BruteForce;

import java.io.*;
import java.util.StringTokenizer;

public class Main14888 {
    private static int N;
    private static int[] array;
    private static int max;
    private static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        array = new int[N];
        max=Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) array[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int add = Integer.parseInt(st.nextToken());
        int minus = Integer.parseInt(st.nextToken());
        int mul = Integer.parseInt(st.nextToken());
        int div = Integer.parseInt(st.nextToken());
        solve(1, array[0], add, minus, mul, div);
        bw.write(max+"\n");
        bw.write(min+"\n");
        bw.close();
    }
    private static void solve(int index, int currResult, int addCount, int minusCount, int mulCount, int divCount){
        if(addCount<0 || minusCount<0 || mulCount<0 || divCount<0) return;
        if(index == N){
            if(currResult>max) max = currResult;
            if(currResult<min) min = currResult;
            return;
        }
        else{
            solve(index+1, currResult+array[index], addCount-1, minusCount, mulCount, divCount);
            solve(index+1, currResult-array[index], addCount, minusCount-1, mulCount, divCount);
            solve(index+1, currResult*array[index], addCount, minusCount, mulCount-1, divCount);
            solve(index+1, currResult/array[index], addCount, minusCount, mulCount, divCount-1);
        }
    }
}
