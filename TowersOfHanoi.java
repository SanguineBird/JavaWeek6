/**Class: CIT-130-BIN1
Name: Meghan Moore
Date: 10/11/2014
Programming Assignment 6 - Towers of Hanoi
Purpose: Make and test two classes: WrapperDeep and WrapperDeep to
demonstrate proper and improper copy constructors*/
import java.util.Scanner;

public class TowersOfHanoi{
  
  public static void main(String[] args){
    char[] array;
    int t = 0; // total number of discs
    int max; // highest identifying value for a disc's index
    int n; //counter
    Scanner keyboard = new Scanner(System.in);
    //prompt for number of discs
    System.out.println("Please enter the total number of discs");
     try{
       t = keyboard.nextInt();
     }
    catch(NumberFormatException e){
      System.err.println("e.getMessage()");
    }

    array = new char[t];
    max = t-1;
    
    //initializes entire array to A
    for(n = max; n >= 0; n--){
      array[n] = 'A';
    }
    
    toString(max, array);
    
    move(max, array);
    
  }
  
  
  public static void toString(int max, char array[]){//add parameter int max
    int n; //counter
      for(n = max; n >= 0; n--){
      System.out.print("Disc " + (n+1) + " is on tower " + array[n] + "; ");
    }
    System.out.println("");
  }
  
  
  public static void move(int max, char array[]){
    int n; //counter
    
    //Step 1-------------------
    for(n = max; n >= 0; n--){
      if(((n-1) != 'A') && ((n-1) != 'B')){
        array[n] = 'B';
        toString(max, array);
      }
      else if(((n-1) != 'A') && ((n-1) != 'C')){
        array[n] = 'C';
        toString(max, array);
      }
      else
        move(max, array);
    }
    
    //Step 2-------------------
    if(((max-1) != 'A') && ((max-1) != 'C')){
      array[max] = 'C';
      toString(max, array);
    }
    else
      move(max, array);
      
    //Step 3-------------------
    for(n = max; n >= 0; n--){
      if(((n-1) != 'B') && ((n-1) != 'C')){
        array[n] = 'C';
        toString(max, array);
      }
      else if(((n-1) != 'B') && ((n-1) != 'A')){
        array[n] = 'A';
        toString(max, array);
      }
      else
        move(max, array);
    }
  }
}
