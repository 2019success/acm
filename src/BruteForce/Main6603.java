package BruteForce;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main6603 {
    private static int[] lotto;
    private static ArrayList<Integer> array;
    private static int k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] input = br.readLine().split(" ");
            array = new ArrayList<>();
            lotto = new int[input.length-1];
            k = Integer.parseInt(input[0]);
            if(k==0) break;
            for(int i=0; i<input.length-1; i++){
                lotto[i] = Integer.parseInt(input[i+1]);
            }
            solve(0, 0);
            System.out.println();
        }
    }
    private static void solve(int count, int index){
        if(count == 6){
            for(int i=0; i<count; i++) System.out.print(array.get(i) + " ");
            System.out.println();
            return;
        }
        if(index>=lotto.length) return;
        else{
            array.add(lotto[index]);
            solve(count+1, index+1);
            array.remove(array.size()-1);
            solve(count, index+1);
        }
    }
}
