class factorial
{
 public static int fact(int n)
 {
 if( n == 0)
 {
 return 1;
 }
 int fa = fact(n-1);
 int f= n* fa;
 return f;
 }
 public static void main(String args[])
{
 System.out.println(fact(5));
}
}