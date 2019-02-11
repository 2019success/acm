package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main10569 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(i<=T){
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            int result=0;
            result = 2-V+E;
            bw.write(result+"\n");
            i++;
        }
        bw.close();
    }
}