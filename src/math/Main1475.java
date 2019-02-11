package math;

import java.io.*;

public class Main1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] check = new int[10];
        String input = br.readLine();
        for(int i=0; i<input.length(); i++){
                check[input.charAt(i)-'0']++;
        }
        if((check[6]+check[9]) % 2 == 0){
            check[6] = (check[6]+check[9])/2;
            check[9] = 0;
         }
        else{
            check[6] = (check[6]+check[9])/2+1;
            check[9] = 0;
        }

        int max=0;
        for(int i=0; i<check.length; i++){
            if(check[i] > max) max = check[i];
        }
        bw.write(max+"\n");
        bw.close();
    }
}