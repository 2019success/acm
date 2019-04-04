package Samsung;

import java.util.Scanner;

public class Main14501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] T = new int[N+1];
        int[] P = new int[N+1];
        int[] dp = new int[N+5];
        for(int i=1; i<=N; i++){
            T[i] = scan.nextInt();
            P[i] = scan.nextInt();
        }
        //거꾸로 N일부터 1일 될때까지 dp값 최신화
        for(int i=N; i>=1; i--){
            //day : 현재날짜에서 그 업무가 걸리는 시간까지의 합
            int day = T[i] + i;
            if(day > N+1) dp[i] = dp[i+1];
            else dp[i] = Math.max(dp[i+1], P[i]+dp[day]); // dp값 최신화. max 값 비교
            //i번째 날 일을하면, 그 날 버는 돈과 + 그 이후로 할 수 있는 dp 값
            //i번째 일을 안하면 i+1번째까지 했던 dp 값
            // 위 2개 비교
        }
        System.out.println(dp[1]);
    }
}
