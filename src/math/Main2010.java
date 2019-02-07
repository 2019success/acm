package math;

import java.io.*;

public class Main2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int multitapLength = Integer.parseInt(br.readLine());
        int[] multitap = new int[multitapLength];
        int result=0;
        for(int j=0; j<multitapLength; j++){
            multitap[j] = Integer.parseInt(br.readLine());
            if(j==multitapLength-1) result+=multitap[j];
            else result += multitap[j]-1;
        }
        bw.write(result+"\n");
        bw.close();
    }
}