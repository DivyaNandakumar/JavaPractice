package easyProblems;

import java.util.Scanner;

public class logPairs {

    //create possible pairs from the inputs
    //time Complexity : O(n^2)
    //Space Complexity : O(n)

    public static void main(String[] args) {

        int n;
        int[] input ;

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("enter total count input");
        n = sc.nextInt();
        input = new int[n];
        System.out.print("Enter the numbers ");
        for(int i=0;i<n; i++){
            input[i]=sc.nextInt();
        }

        for (int j=0;j<n;j++){
            for (int k=n-1;k>-1;k--){
                System.out.println(input[j]+" "+input[k]);
            }
        }
    }


}
