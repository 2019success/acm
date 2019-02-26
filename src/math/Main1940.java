package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count=0;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[M+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp<M) {
                if (visited[M-temp]) {
                    count++;
                    visited[M-temp] = false;
                }
                else visited[temp] = true;
            }
        }
        bw.write(count+"\n");
        bw.close();
    }
}