package math;

import java.io.*;

public class Main2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] fibo= new int[N+1];
        if(N==0) fibo[0]=0;
        else {
            fibo[0]=0;
            fibo[1]=1;
        }
        for(int j=2; j<fibo.length; j++){
            fibo[j] = fibo[j-2]+fibo[j-1];
        }
        bw.write(fibo[N]+"\n");
        bw.close();
    }
}