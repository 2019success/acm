package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main11006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i =1;
        int Test = Integer.parseInt(br.readLine());
        while(i<=Test){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int T = N-M;
            int U = M-T;
            bw.write(U+" "+T+"\n");
            i++;
        }
        bw.close();
    }
}
