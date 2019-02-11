package math;

import java.io.*;

public class Main2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i=1;
        int T = Integer.parseInt(br.readLine());
        while(i<=T){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] matrix = new int[k+1][n+1];
            for(int j=1; j<=n; j++) matrix[0][j] = j; //0층 초기화

            for(int j=1; j<=k; j++){ //1층부터~
                for(int l=1; l<=n; l++){
                    if(l==1) matrix[j][l]=1;
                    else{
                        matrix[j][l] = matrix[j][l-1] + matrix[j-1][l];
                    }
                }
            }
            bw.write(matrix[k][n] + "\n");
            i++;
        }
        bw.close();
    }
}