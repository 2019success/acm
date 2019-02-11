package math;

import java.io.*;

public class Main8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            String input = br.readLine();
            int count=0;
            int sumScore=0;
            for(int j=0; j<input.length(); j++){
                if(input.charAt(j)=='O'){
                    count++;
                    sumScore+=count;
                }
                else count=0;
            }
            bw.write(sumScore+"\n");
            i++;
        }
        bw.close();
    }
}