package math;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] check = new boolean[100000];
        int result;
        for(int i=1; i<=10000; i++){
            result = reverseSum(i);
            check[result] = true;
        }
        for(int i=1; i<=10000; i++){
            if(!check[i]) bw.write(i+"\n");
        }
        bw.close();
    }
    private static int reverseSum(int num){
        int res=0;
        res+=num;
        while(num>0){
            res+=num%10;
            num/=10;
        }
        return res;
    }
}