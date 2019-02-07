package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int kimNumber = Integer.parseInt(st.nextToken());
        int limNumber = Integer.parseInt(st.nextToken());
        int result=0;
        while(kimNumber != limNumber){
            kimNumber = kimNumber/2 +kimNumber%2;
            limNumber = limNumber/2 + limNumber%2;
            result++;
        }
        bw.write(result+"\n");
        bw.close();
    }
}