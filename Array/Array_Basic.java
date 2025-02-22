public class Array_Basic {

    public static void main(String[] args) {
        

        int arr[]={78,30,32,89,67,90,45};

                      //Declare & initialize
        int size =5;
        int marks[]=new int[size];

        //access data
        System.out.println(arr[0]);

        System.out.println(arr.length);

      System.out.println(marks[0]);             //if no element in array then they display null value


      for(int i=0;i<arr.length;i++)
      {
        System.out. println("array value = "+arr[i]);
      }

      //for each loop

      for(int value : arr)
      {
        System.err.println("value =  "+ value);
      }

      arr[0]=100;                      //update index value 
      System.out.println("value of 0 idx array ="+arr[0]);
    }

}
