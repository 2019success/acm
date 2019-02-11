package math;

import java.io.*;

public class Main1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[26];
        char[] str = br.readLine().toCharArray();
        for(int j=0; j<str.length; j++){
            if(str[j]!=' '){
                array[Character.toLowerCase(str[j])-97]++;
            }
        }
        int max=0;
        int index=0;
        boolean maxValueCheck = false;
        String result;
        for(int j=0; j<array.length; j++){
            if(array[j] > max) {
                max = array[j];
                index=j;
                maxValueCheck = false;
            }
            else if(array[j] == max) maxValueCheck = true;
        }
        if(maxValueCheck) result="?";
        else result = String.valueOf(Character.toUpperCase((char)(index+97)));
        bw.write(result+"\n");
        bw.close();
    }
}