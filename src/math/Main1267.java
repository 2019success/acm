package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y=0;
        int M=0;
        for(int i=0; i<N; i++){
            int time = Integer.parseInt(st.nextToken());
            int temp = time;
            Y = Y+(time/30+1)*10;
            M = M+(temp/60+1)*15;
        }
        if(Y>M) bw.write("M "+M+"\n");
        else if(Y<M) bw.write("Y " + Y +"\n");
        else bw.write("Y M " + Y + "\n");
        bw.close();
    }
}