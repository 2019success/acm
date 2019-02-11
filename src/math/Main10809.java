package math;

import java.io.*;
import java.util.Arrays;

public class Main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[26];
        Arrays.fill(array, -1);
        String str = br.readLine();
        for(int j=0; j<str.length(); j++) {
            if(array[str.charAt(j)-97] == -1){
                array[str.charAt(j)-97] = j;
            }
        }
        for(int j=0; j<array.length; j++) {
            bw.write(array[j]+ " ");
        }
        bw.close();
    }
}