package math;

import java.io.*;

public class Main9546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T=Integer.parseInt(br.readLine());
        while(i<=T){
            int count=1;
            int k = Integer.parseInt(br.readLine());
            double people=0.0;
           while (count<=k){
               people +=0.5;
               people = people*2;
               count++;
           }
           bw.write((int)people+"\n");
           i++;
        }
        bw.close();
    }
}
