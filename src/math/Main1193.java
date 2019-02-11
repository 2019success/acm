package math;

import java.io.*;

public class Main1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int i=0;
        int sum=1;
        while(sum<X){
            i++;
            sum = sum + i;
        }
        int start=1;
        int index = 0;
        while(index!=i){
            start = start+index;
            index++;
        }
        int temp = X-start;
        if(sum==X){
            if(i%2==0) bw.write((i+1) + "/1"+"\n");
            else bw.write("1/"+(i+1)+"\n");
        }
        else{
            if(i%2!=0) bw.write((i-temp)+"/"+(temp+1)+"\n");
            else bw.write((temp+1)+"/"+(i-temp)+"\n");
        }
        bw.close();
    }
}
