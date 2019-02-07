package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int temp=0;
        int count=0;
        while(true){
            count++;
            temp+=A;
            if(temp>=V){
                break;
            }
            temp-=B;
        }
        bw.write(count+"\n");
        bw.close();
    }
}