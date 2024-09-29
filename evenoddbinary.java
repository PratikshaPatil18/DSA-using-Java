public class evenoddbinary
{
 

 
 public static void evenodd(int n)
 {
	  int bitmask =1;
  if (( n & bitmask) ==0)
  {
   System.out.println("even number");
  }else{
  System.out.println("odd number");
  }
 }
 
 public static void main(String args[])
 {
	 evenodd(7);
	 evenodd(10);
 }
}