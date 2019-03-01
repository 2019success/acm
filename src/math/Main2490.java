package math;

import java.io.*;

public class Main2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        while(i<=3){
            String result ="";
            int front=0; //배
            int back=0; //등
            String[] input = br.readLine().split(" ");
            for(int j=0; j<input.length; j++){
                if(input[j].equals("0")) front++;
                else if(input[j].equals("1")) back++;
            }
            if(front== 1 && back ==3) result = "A";
            else if(front==2 && back ==2) result ="B";
            else if(front==3 && back ==1) result="C";
            else if(front==4) result = "D";
            else if(back==4) result ="E";
            bw.write(result+"\n");
            i++;
        }
        bw.close();
    }
}
