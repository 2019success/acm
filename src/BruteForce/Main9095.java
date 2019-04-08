package BruteForce;

import java.io.*;

public class Main9095 {
    private static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int testCase=1;
        while(testCase<=T){
            int n = Integer.parseInt(br.readLine());
            int count=0;
            int sum=0;
            answer=0;
            solve(count, sum, n);
            bw.write(answer+"\n");
            testCase++;
        }
        bw.close();
    }
    private static void solve(int count,int sum,int n){
        if(sum>n) return;
        else if(sum==n) answer++;
        else{
            for(int i=1; i<=3; i++){
                solve(count+1, sum+i, n);
            }
        }
    }
}