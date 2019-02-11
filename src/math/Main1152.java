package math;

import java.io.*;

public class Main1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result=0;
        String input = br.readLine();
        char[] array = new char[10000002];
        for(int j=0; j<input.length(); j++) {
            array[j] = input.charAt(j);
            if(array[j]==' ') result++;
        }
        if(array[0] == ' ' && array[input.length()-1] == ' ') {
            result --;
        }
        else if(array[0] != ' ' && array[input.length()-1] != ' ') result ++;
        bw.write(result+"\n");
        bw.close();
    }
}
