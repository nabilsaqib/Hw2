package hw2;
import java.util.Scanner;
public class Array {
public static void main(String[] args) {

System.out.println("Enter a starting number: ");

Scanner num = new Scanner(System.in);
int[] numbers = new int[5]; //creating array
for (int i = 0; i<5;i++){	//Starting point, do while i is less than 5, count i by 1
numbers[i]=num.nextInt(); //declaring the value for [1]

}
int sum = 0;
        
        for (int i=0; i < numbers.length ; i++) {
            sum = sum + numbers[i];
        }
          
        System.out.println("Sum value of array elements is : " + sum);

num.close();  
    }
 


}