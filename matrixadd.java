import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int r=x.nextInt();
        int c=x.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=x.nextInt();
            }
        }
        int m=0;
        for(int i=0;i<r;i++){
            int w=0;
            for(int j=0;j<c;j++){
                w+=arr[i][j];
            }
            if(w>m)
            {
                m=w;
            }
        }
        System.out.println("Richest Customer Wealth is "+m);
    }
}
