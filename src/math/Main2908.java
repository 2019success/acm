package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if(reverse(A) > reverse(B)) bw.write(reverse(A)+"\n");
        else bw.write(reverse(B)+"\n");
        bw.close();
    }
    private static int reverse(int num){
        int temp=0;
        while(num>0){
            temp += num%10;
            temp *= 10;
            num/=10;
        }
        return temp/10;
    }
}