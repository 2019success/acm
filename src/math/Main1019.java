package math;

import java.io.*;

public class Main1019 {
    private static int[] count;
    private static int pos=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int start=1;
        int end=N;
        count = new int[10];
        while(start<=end){
            while(start%10!=0 && start<=end){
                cal(start);
                start++;
            }
            if(start>end) break;

            while(end%10!=9 && start<=end){
                cal(end);
                end--;
            }
            start/=10;
            end/=10;

            for(int i=0; i<10; i++) count[i] += (end-start+1) * pos;
            pos *= 10;
        }
        for(int i=0; i<count.length; i++) bw.write(count[i] + " ");
        bw.write("\n");
        bw.close();
    }
    private static void cal(int num){
        while(num>0){
            count[num%10] += pos;
            num/=10;
        }
    }
}
