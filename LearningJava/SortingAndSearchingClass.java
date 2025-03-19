/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brocode.workspace;

/**
 *
 * @author Paxton.Clark
 */
public class SortingAndSearching {
    
    // Searching Algorithms
    public static int linearSearch(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] array, int target) {
    // This method was created to learn how a binary search works, 
    // but you can use Array.binarySearch(array, target) for 
    // simplicity and speed. 
    // Required import: import java.util.Arrays;
        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int middle = low + (high - low) / 2;
            int value = array[middle];
            System.out.println("Middle: " + value);
            
            if(value < target){
                low = middle + 1;
            }else if(value > target){
                high = middle -1;
            }else{
                return middle;
            }  
        }
        return -1;
    }
    
    public static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        
        while(value >= array[low] && value <= array[high] && low <= high){
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            
            System.out.println("Probe: " + probe);
            
            if(array[probe] == value){
                return probe;
            }else if(array[probe] < value){
                low = probe + 1;
            }else{
                high = probe - 1;
            }
        }
        return -1;
    }
    
    // Sorting Algorithims
    public static void bubbleSortAscending(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){ // Switch > to < for decending order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } 
    }
    
    public static void bubbleSortDescending(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] < array[j + 1]){ // Switch < to > for ascending order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        } 
    }
    
    public static void selectionSortAscending(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){  // Switch > to < for decending order
                    min = j; 
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    
    public static void selectionSortDescending(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] < array[j]){  // Switch < to > for ascending order
                    min = j; 
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    } 
}

