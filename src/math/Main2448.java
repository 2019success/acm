package math;

import java.io.*;

public class Main2448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] array = new String[N];
        array[0] = "  *  ";
        array[1] = " * * ";
        array[2] = "*****";

        for(int k=0; 3*(int)Math.pow(2,k)<N; k++){ //
            printStar(array,k); //6[0~5]
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        bw.close();
    }
    private static void printStar(String[] array, int k) {
        int i=0;
        String temp="";
        for(int j=3*(int)Math.pow(2,k); j<3*(int)Math.pow(2,k+1); j++){
            array[j] = array[i] + " " + array[i];
            i++;
        }
        for(int j=0; j<3*(int)Math.pow(2,k); j++){
            temp+=" ";
        }
        for(int j=0; j<3*(int)Math.pow(2,k); j++){
            array[j] = temp + array[j] + temp;
        }
    }
}
