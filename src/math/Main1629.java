package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        bw.write(pow(A,B,C) + "\n");
        bw.close();
    }
    private static long pow(long a, long b, long c){
        if(b==0) return 1;

        else{
            long n = pow(a, b/2,c);
            if(b%2==0) return n*n%c;
            else return (n*n%c)*a%c;
        }
    }
}
