/**Class: CIT-130-BIN1
Name: Meghan Moore
Date: 10/11/2014
Programming Assignment 6 - Towers of Hanoi
Purpose: Make and test two classes: WrapperDeep and WrapperDeep to
demonstrate proper and improper copy constructors*/

public class TowersOfHanoi{
  
  public static void main(String[] args){
    char[] array;
    int t; // total number of discs
    int n; //counter
    /*Scanner keyboard = new Scanner(System.in);
    //prompt for number of discs
    System.out.println("Please enter the total number of discs");
     try{
       t = keyboard.nextInt();
     }
    catch(NumberFormatException e){
      System.err.println("e.getMessage()");
    }*/
    t = 3; //replace this with above
    array = new char[t];
    
    //initializes entire array to A
    for(n = t; n >= 0; n--){
      array[n] = 'A';
    }
    
    toString(array);
    
    move(t, array);
    
    toString(array);
  }
  
  
  public static void toString(char array[]){//add parameter int t
    /*int n; //counter
      for(n = t; n >= 0; n--){
      System.out.print("Disc " + (n+1) + " is on tower " + array[n] + "; ");
    }
    */
    System.out.println("Disc 1 is on tower " + array[0] + "; Disc 2 is on tower " + array[1] + "; Disc 3 is on tower " + array[2]);
  }
  
  
  public static void move(int t, char array[]){
    int n; //counter
    
    //Step 1-------------------
    for(n = t; n >= 0; n--){
      if(((n-1) != 'A') && ((n-1) != 'B'))
        array[n] = 'B';
      else if(((n-1) != 'A') && ((n-1) != 'C'))
        array[n] = 'C';
      else
        move(t, array);
    }
    
    //Step 2-------------------
    if(((t-1) != 'A') && ((t-1) != 'C'))
      array[t] = 'C';
    else
      move(t, array);
      
    //Step 3-------------------
    for(n = t; n >= 0; n--){
      if(((n-1) != 'B') && ((n-1) != 'C'))
        array[n] = 'C';
      else if(((n-1) != 'B') && ((n-1) != 'A'))
        array[n] = 'A';
      else
        move(t, array);
    }
    
    toString(array);
  }
}
