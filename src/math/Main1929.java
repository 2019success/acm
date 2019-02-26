package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1929 {
    public static void main(String[] args) throws IOException {
        boolean[] visited = new boolean[1000001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        visited[0] = true;
        visited[1] = true;
        for(int i=2; i<=(int)Math.sqrt(1000001); i++){
            int j=2;
            while(i*j<=1000000){
                if(!visited[i*j]) {
                    visited[i*j] = true;
                    j++;
                }
               else j++;
            }
        }
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for(int i=M; i<=N; i++){
            if(!visited[i]) bw.write(i+"\n");
        }
        bw.close();
    }
}