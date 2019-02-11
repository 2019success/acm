package math;

import java.io.*;

public class Main1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result;
        int N = Integer.parseInt(br.readLine());
        if(N<100) result = N;
        else{
            result = 99;
            for(int j=100; j<=N; j++) {
                if(numberCheck(j)) result++;
            }
        }
        bw.write(result+"\n");
        bw.close();
    }
    private static boolean numberCheck(int num){
        String str = String.valueOf(num);
        int[] temp = new int[str.length()];
        for(int i=temp.length-1; i>=0; i--){
            temp[i] = num%10;
            num/=10;
        }
        int difference1 = temp[1]-temp[0];
        int difference2 = temp[2]-temp[1];
        if(difference1==difference2) return true;
        return false;
    }
}
