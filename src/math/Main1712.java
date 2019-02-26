package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result;
        int count=1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
        long cost=A+B*count;
        long noteBookSell=C*count;
        if(B>=C) result = -1;
        else {
            while (cost >=noteBookSell) {
                count++;
                cost = A + B * count;
                noteBookSell = C*count;
            }
            result = count;
        }
        bw.write(result+"\n");
        bw.close();
    }
}