package BruteForce;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1759 {
    private static int C;
    private static int L;
    private static String[] alpha;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        alpha = new String[C];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<C; i++) alpha[i] = st.nextToken();
        Arrays.sort(alpha);
        solve("", 0);
    }
    private static void solve(String currPassword, int index){
        if(currPassword.length() == L) {
            if(check(currPassword)) System.out.println(currPassword);
            return;
        }
        if(index>=C) return;
        else{
            solve(currPassword+alpha[index], index+1);
            solve(currPassword, index+1);
        }
    }
    private static boolean check(String currPassword){
        int ja=0;
        int mo=0;
        for(int i=0; i<currPassword.length(); i++){
            char temp = currPassword.charAt(i);
            if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u') mo++;
            else ja++;
        }
        return ja>=2 && mo>=1;
    }
}
