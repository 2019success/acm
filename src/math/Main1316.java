package math;

import java.io.*;
import java.util.Arrays;

public class Main1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int i=1;
        int count=0;
        while(i<=T){
            char[] array = br.readLine().toCharArray();
            int[] check = new int[26];
            Arrays.fill(check, -1);
            check[array[0]-97]++;
            for(int j=1; j<array.length; j++){
                if(array[j-1] == array[j]) continue;
                if(array[j-1] != array[j] && check[array[j]-97] == -1){
                    check[array[j]-97]++;
                }
                else if(array[j-1] != array[j] && check[array[j]-97]==0) check[array[j]-97]++;
            }
            boolean flag = true;
            for(int j=0; j<check.length;j++){
                if(check[j]>=1) {
                    flag = false;
                    break;
                }
            }
            if(flag) count ++;
            i++;
        }
        bw.write(count+"\n");
        bw.close();
    }
}