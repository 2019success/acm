package math;

import java.io.*;

public class Main1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long[] multy = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        long um;
        int index1=0;
        int index2=0;
        int index3=0;
        for(int j=0; j<array.length; j++){
            if(str1.equals(array[j])) index1=j;
            if(str2.equals(array[j])) index2=j;
            if(str3.equals(array[j])) index3=j;
        }
        um = (index1*10 + index2) * multy[index3];
        bw.write(um + " \n");
        bw.close();
    }
}