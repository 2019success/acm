package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for(int j=0; j<N; j++){
            array[j] = Integer.parseInt(st.nextToken());
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int j=0; j<N; j++){
            sum+=array[j];
            if(max<sum) max = sum;
            if(sum<0) sum=0;
        }
        bw.write(max+"\n");
        bw.close();
    }
}