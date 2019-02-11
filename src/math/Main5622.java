package math;

import java.io.*;

public class Main5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = {"0", "0", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "0"};
        char[] chr = br.readLine().toCharArray();
        int[] number = new int[chr.length];

        for(int i=0; i<chr.length; i++){
            for(int j=2; j<=9; j++){
                for(int k=0; k<arr[j].length(); k++){
                    if(chr[i] == arr[j].charAt(k)) number[i] = j;
                }
            }
        }
        int result=0;
        for(int i=0; i<number.length; i++){
            result += number[i]+1;
        }
        String str="";
        bw.write(result+"\n");
        bw.close();
    }
}
