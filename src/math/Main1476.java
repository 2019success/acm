package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count=0;
        int e=0;
        int s=0;
        int m=0;
        while(true){
            count++;
            e++;
            s++;
            m++;
            if(e==16) e=1;
            if(s==29) s=1;
            if(m==20) m=1;
            if(e==E && s==S && m==M)break;
        }
        bw.write(count+"\n");
        bw.close();
    }
}
