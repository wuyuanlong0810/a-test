import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] st = bf.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {

            }
        }
    }
}


