package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String result ="";
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int line;
            int height;
            String temp;
            if(N%H==0) line = N/H;
            else line = N/H+1;

            if(N%H==0) height = H;
            else height = N%H;

            if(line<=9) temp = "0".concat(String.valueOf(line));
            else temp = String.valueOf(line);
            bw.write(height+temp+"\n");
            i++;
        }
        bw.close();
    }
}
