/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Random;

/**
 *
 * @author EminDervisevic
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int temp = 0;
        System.out.println("Not sorted:");
            for (int i = 0; i < arr.length; i++){
                arr[i] = r.nextInt(50)+1;
                System.out.print(arr[i]+" ");
            }
        System.out.println("");
        
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("\nSorted:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
