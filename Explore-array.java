// Day 8

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            }
        for(int i=0;i<n;i++){
            if(arr[i] % 2==0){
               System.out.print(0+" ");
            }
            else {
                    System.out.print(1+" ");
               }
            }
            }
        
    }
