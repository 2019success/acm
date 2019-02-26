package math;

import java.io.*;

public class Main2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] visited = new boolean[10001];
        visited[0] = true;
        visited[1] = true;
        for(int i=2; i<(int)Math.sqrt(10000); i++){
            int j=2;
            while(i*j<=10000){
                visited[i*j] = true;
                j++;
            }
        }
        int sum=0;
        int min=0;
        int count=1;
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        for(int i=M; i<=N; i++){
            if(!visited[i] && count==1){
                sum+=i;
                min=i;
                count++;
            }
            else if(!visited[i]) sum+=i;
        }
        if(sum!=0) {
            bw.write(sum + "\n");
            bw.write(min+"\n");
        }
        else bw.write("-1\n");
        bw.close();
    }
}
