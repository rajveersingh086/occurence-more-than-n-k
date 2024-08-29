package geeks.searching;

import java.util.*;
public class occurence_n_k {
    static int moreocc(int arr[],int n,int k){
        Arrays.sort(arr);

        int count =0;
        int threshold=n/k;
        //traverse the array .
        for (int i =0;i < n;){
            int element = arr[i];
            int frequency = 0;

        //count the occurrence
        while (i<n && arr[i] == element) {
            frequency++;
            i++;
        }
        if ( frequency >threshold){
            count++;
        }
        }
        return count ;
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the no of element");
        int n = sc.nextInt();

        System.out.println("enter the array :");
        int arr [] = new int [n];
        for (int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the element to be divide to n :");
        int k = sc.nextInt();

        int result = moreocc(arr, n, k);
        System.out.println("in the giver arrey "+ result + " are more than n/2 elements.");
    }
}

// time complexity : nlogn.
