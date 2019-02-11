package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main2355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long result;
        if(A>B){
            long temp = A;
            A = B;
            B = temp;
        }
        result = B*(B+1)/2 - A*(A+1)/2 + A;
        bw.write(result+"\n");
        bw.close();
    }
}
