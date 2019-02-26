package math;

import java.io.*;

public class Main4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] visited = new boolean[123456*2 + 1];
        visited[0] = true;
        visited[1] = true;
        for(int i=2; i<(int)Math.sqrt(123456*2); i++){
            int j=2;
            while(i*j<=123456*2){
                if(!visited[i*j]){
                    visited[i*j] = true;
                    j++;
                }
                else j++;
            }
        }
        int count;
        while(true){
            count=0;
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            else{
                for(int i=n+1; i<=2*n; i++){
                    if(!visited[i]) count++;
                }
            }
            bw.write(count+"\n");
        }
        bw.close();
    }
}