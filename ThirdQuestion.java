package com.Asignment1;

public class ThirdQuestion {
    public static void main(String[] args) {

        int n = 9;
        int i,j;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i+j<=(n-1)/2 || j-i>=(n-1)/2|| j==0 && i>(n-1)/2 || j==(n-1) && i>(n-1)/2 || i==(n-1)){
                    System.out.print(" * ");
                }
                    else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
