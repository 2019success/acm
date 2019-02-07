package math;

import java.io.*;

public class Main1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] matrix = new String[N][N];
        for(int j=0; j<N; j++){
            String[] input = br.readLine().split("");
            for(int k=0; k<N; k++){
                matrix[j][k] = input[k];
            }
        }
        int garo=0;
        int sero=0;
        for(int j=0; j<N; j++){
            int possible=0;
            for(int k=0; k<N; k++){
                if(matrix[j][k].equals(".")) possible++;
                else if(matrix[j][k].equals("X") && possible>=2){
                    garo++;
                    possible=0;
                }
                else if(matrix[j][k].equals("X")) possible=0;
            }
            if(possible>=2) garo++;
        }

        for(int j=0; j<N; j++){
            int possible=0;
            for(int k=0; k<N; k++){
                if(matrix[k][j].equals(".")) possible++;
                else if(matrix[k][j].equals("X") && possible>=2) {
                    sero++;
                    possible=0;
                }
                else if(matrix[k][j].equals("X")) possible=0;
            }
            if(possible>=2) sero++;
        }
        bw.write(garo+" " + sero + "\n");
        bw.close();
    }
}