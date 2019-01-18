/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javastringsarrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaStringsArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*int[] intArray;
        int n = 10;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //intArray = new int[10];
        intArray = new int[n];
        
        for (int i : intArray) {
            System.out.println(i);
        }
        
        //intArray = new int[]{1, 2, 5};
        
        System.out.println(intArray[1]);*/
        
        //int[][] intArray2 = {{1, 2, 3}, {-3, 0, 10}, {18, 99, 50}};
        //int[][] intArray2 = {{1, 2}, {-3, 0, 10}, {18, 99, 50, 100}};
        //int[][] intArray2 = new int[3][];
        /*for (int[] arrayItem : intArray2) {
            System.out.println(arrayItem);
        }*/
        /*for (int[] arrayItem : intArray2) {
            arrayItem = new int[new Random().nextInt(4) + 1];
            //System.out.println(new Random().nextInt(4));
        }*/
        
        /*for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = new int[new Random().nextInt(4) + 1];
        }*/
        
        /*for (int[] arrayItem : intArray2) {
            System.out.println(arrayItem.length);
        }*/
        
        /*for (int[] arrayItem : intArray2) {
            System.out.println(arrayItem.length);
        }*/
        
        /*for (int[] arrayItem : intArray2) {
            for (int i : arrayItem) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/
        
        
       int[][] multArr;
       multArr = new int[11][11];
        
       
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if(i == 0 && j == 0){
                    multArr[i][j] = 0;
                    //System.out.printf("%4s", "");
                } else if (i == 0) {
                    multArr[i][j] = j;
                    //System.out.printf("%4d", j);
                } else if (j == 0) {
                    multArr[i][j] = i;
                    //System.out.printf("%4d", i);
                } else {
                    multArr[i][j] = i * j;
                    //System.out.printf("%4d", i * j);
                }
                //System.out.printf("%d", i * j);
            }
            //System.out.println();
        }
        
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (multArr[i][j] == 0) {
                    System.out.printf("%4s", "");
                } else{
                    System.out.printf("%4d", multArr[i][j]);
                }
            }
            System.out.println();
        }
    }
    
}
