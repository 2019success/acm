package math;

import java.io.*;

public class Main2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] change = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();
        int count=0;
        while(str.length()!=0){
            boolean flag=true;
            for(int k=0; k<change.length; k++) {
               if(str.length()>=change[k].length() && str.substring(0,change[k].length()).equals(change[k])){
                   str = str.substring(change[k].length());
                   flag = false;
                   count++;
                   break;
               }
           }
           if(flag) {
               str = str.substring(1);
               count++;
           }
        }
        bw.write(count+"\n");
        bw.close();
    }
}
