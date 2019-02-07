package math;

import java.io.*;

public class Main9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int sum=0;
            int N = Integer.parseInt(br.readLine());
            int[] array = new int[N/2];
            if(N == -1) break;
            for(int j=1; j<=N/2; j++){
                if(N%j==0) {
                    sum+=j;
                    array[j-1] = j;
                }
            }
            if(sum==N) {
                bw.write(N + " = ");
                for(int k=0; k<array.length;k++) {
                    if(array[k] !=0 && k!=array.length-1) bw.write(array[k]+ " + ");
                    if(array[k] !=0 && k==array.length-1) bw.write(array[k]+"\n");
                }
            }
            else bw.write(N+" is NOT perfect.\n");
        }
        bw.close();
    }
}