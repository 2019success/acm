package math;

import java.io.*;

public class Main1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] temp = br.readLine().toCharArray();
        int F = Integer.parseInt(br.readLine());
        temp[temp.length-1] ='0';
        temp[temp.length-2] ='0';
        String N="";
        for(int j=0; j<temp.length; j++){
            N = N.concat(String.valueOf(temp[j]));
        }
        int num = Integer.parseInt(N);
        while(true){
            if(num%F==0) break;
            num++;
        }
        N = String.valueOf(num);
        temp = N.toCharArray();
        bw.write(temp[temp.length-2]+""+temp[temp.length-1]+"\n");
        bw.close();
    }
}
