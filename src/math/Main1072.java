package math;

import java.io.*;
import java.util.StringTokenizer;

public class Main1072 {
    public static void main(String[] args) throws IOException {
        long result=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());

        long Z = Y*100/X;
        //확률이 바뀔 수 없는 경우
        int low=0, high = 1000000000;
        if(Z>=99) result = -1;
        else{
            while(low<=high){
                int mid = (low+high)/2;
                //이분탐색 결과 확률
                long tmpZ = (Y+mid)*100 / (X+mid);
                if(Z>=tmpZ){
                    result = mid+1;
                    low = mid+1;
                }
                else high = mid-1;
            }
        }
        bw.write(result+"\n");
        bw.close();

    }
}
