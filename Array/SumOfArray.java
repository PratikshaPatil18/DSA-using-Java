
import java.util.Scanner;

//package Array;

public class SumOfArray {

    public static int Sum(int [] marks)
    {
        int totalsum =0;
        for(int i=0;i<marks.length;i++)                      //linear O(n)
        {
            totalsum += marks[i];
        }

        return totalsum;
    }


 public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array size = ");
        int size = sc.nextInt();
        int marks[]= new int [size];

        System.err.println("Enter Array Elements  = ");
    for(int i=0;i<size;i++)
    {
      
        marks [i] = sc.nextInt();
    }

       // int marks[]={29,302,20,390,1201};
      
        int sum = Sum(marks);
        System.err.println("Sum of Array = "+ sum);

}

        
    }
