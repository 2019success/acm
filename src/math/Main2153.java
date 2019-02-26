package math;

import java.io.*;

public class Main2153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String result;
        String str = br.readLine();
        int sum=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i) <='z') sum+=str.charAt(i)-96;
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z') sum+=str.charAt(i)-38;
        }
        if(isPrime(sum)) result = "It is a prime word.";
        else result = "It is not a prime word.";
        bw.write(result+'\n');
        bw.close();
    }
    private static boolean isPrime(int num){
        if(num==1) return true;
        //boolean[] visited = new boolean[num];
        for(int i=2; i<num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}