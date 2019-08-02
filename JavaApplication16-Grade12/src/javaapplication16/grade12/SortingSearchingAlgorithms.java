package javaapplication16.grade12;
import java.util.*;

/**
 *
 * @author Vedant
 */
public class JavaApplication16Grade12 {

   //Bubble Sort 
    public static void bubble(int[] arrayNum){
        int a = (int) System.nanoTime();
        for(int x = 0; x < arrayNum.length; x++){
            boolean swapped = true;
            for(int i = 0; i < arrayNum.length - 1; i++){
                if(arrayNum[i] > arrayNum[i + 1]){
                    int val = arrayNum[i];
                    arrayNum[i] = arrayNum[i + 1];
                    arrayNum[i + 1] = val;
                    swapped = false;
                }                
            }
            if(swapped)
                break;
        }
        int b = (int) System.nanoTime();
        System.out.println(b - a);
    }
    
    //Insertion Sort
    public static void insertion(int[] arrayNum){
        int a = (int) System.nanoTime();
        for(int i = 1; i < arrayNum.length; i++){
            int value = arrayNum[i];
            int j = i - 1;
            while(j >= 0 && arrayNum[j] > value){
                arrayNum[j + 1] = arrayNum[j];
                j -= 1;
            }
            arrayNum[j + 1] = value;
        }
        int b = (int) System.nanoTime();
        System.out.println(b - a);
    }
    
    //Selection sort
    public static void selection(int[] arrayNum){
        int a = (int) System.nanoTime();
        int arrayIndex = 0;
        int smallestNum = 0;
        
        for(int x = 0; x < arrayNum.length; x++){
            arrayIndex = x;
            for(int i = x + 1; i < arrayNum.length - 1; i++){
                if(arrayNum[arrayIndex] > arrayNum[i]){
                    arrayIndex = i;
                }
            }
            if(arrayIndex != x){
                int tmp = arrayNum[x];
                arrayNum[x] = arrayNum[arrayIndex];
                arrayNum[arrayIndex] = tmp;
            }
        }
        int b = (int) System.nanoTime();
        System.out.println(b - a);
    }
    
    public static void linearSearch(int[] arrayNum){
        int a = (int) System.nanoTime();
        int x = 2;
        for(int counter1 = 0; counter1 < arrayNum.length; counter1++){
            if(arrayNum[counter1] == x){
                int b = (int) System.nanoTime();
                System.out.println(b - a);
                System.exit(0);
            }
        }
    }
    
    public static void binarySearch(int[] arrayNum){
        int a = (int) System.nanoTime();
        int highNum = arrayNum.length - 1;
        int lowNum = 0;
        int guess = 0;
        int x = 2;
        while(highNum >= lowNum){
            guess = (highNum - lowNum) / 2 + lowNum;
            if(arrayNum[guess] > x)
                highNum = guess - 1;
            else if(arrayNum[guess] < x)
                lowNum = guess + 1;
            else{
                System.out.println(arrayNum[guess]);
                int b = (int) System.nanoTime();
                System.out.println(b - a);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayNum = new int[50];
        Random rand = new Random();
        for(int counter1 = 0; counter1 < arrayNum.length; counter1++){
            int num = (rand.nextInt(5000) + 1);
            arrayNum[counter1] = num;
        }
        
        arrayNum[5] = 2;
        //linearSearch(arrayNum);
        //bubble(arrayNum);
        insertion(arrayNum);
        //selection(arrayNum);
        binarySearch(arrayNum); 
    }
    
}
