package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        bw.write(reverse(reverse(X) + reverse(Y)) + "\n");
        bw.close();
    }
    private static int reverse(int number){
        boolean flag = true;
        int result=0;
        while(flag){
            result*=10;
            result+=number%10;
            number/=10;
            if(number==0) flag = false;
        }
        return result;
    }
}