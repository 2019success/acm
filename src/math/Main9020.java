package math;

import java.io.*;

public class Main9020 {
    public static void main(String[] args) throws IOException {
        boolean[] visited = new boolean[10001];
        visited[0] = true;
        visited[1] = true;
        for(int j=2; j<=(int)Math.sqrt(10000); j++){
            int k=2;
            while(j*k<=10000){
                if(!visited[j*k]){
                    visited[j*k] = true;
                    k++;
                }
                else k++;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=1;
        int T=Integer.parseInt(br.readLine());
        while(i<=T){
            int n = Integer.parseInt(br.readLine());
            for(int j=n/2; j>=2; j--){
                if(!visited[j] && !visited[n-j]){
                    bw.write(j + " " + (n-j) + "\n");
                    break;
                }
            }
            i++;
        }
        bw.close();
    }
}