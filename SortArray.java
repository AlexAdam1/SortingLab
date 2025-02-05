import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    
    public static void main(String [] args){
        int [] thisArray = new int []{3, 50, 20, 77, 24, 82, 24, 60};
        sortArray(thisArray, 8);
        userIntegration();
    }
    
    public static void sortArray(int [] myArr, int arrSize){
        int current = 1;
        int holder = 0;
        int number = 0;
        for (int e = 0; e < myArr.length - 1; e++) {
            for (int i = 0; i < myArr.length - e - 1; i++) {
                if (myArr[i] < myArr[i + 1]) {
                    holder = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1]= holder;
                }
                current++;
            }
        }
        System.out.println(Arrays.toString(myArr));
    }
    
    public static void userIntegration(){
        Scanner keyboard = new Scanner(System.in);
        int number;
        int list;
        System.out.println("How many numbers would you like to sort? Please enter a number");
        list = keyboard.nextInt();
        int [] thatArray = new int [list];
        System.out.println("What numbers would you like to sort? Please enter each number individually");
        for (int i = 0; i < list; i++){
            number = keyboard.nextInt();
            thatArray[i] = number;
        }
        System.out.println("Here is your sorted array: ");
        sortArray(thatArray, list);
    }
}
