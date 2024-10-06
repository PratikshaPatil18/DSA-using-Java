class backtrackArray
{
	public staic void curr(int arr, int idx, int val)
	{
		if( idx == arr.length)    //base case
		{
			printarr(arr);
			return;
		}
		arr[idx]= val;         //store val
		curr(arr,idx+1,val+1);  //increase idx and val by 1
		arr[idx]=arr[idx] -2 ;   //backtracking step whose reduce by 2
		
		
		public static void printarr()           //print array
		{
			for(int i=0 ;i< arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println();
		}
		
	}
	 public static void main(String args[])
	 {
		 int arr = new arr[5];
		 curr(arr,0,1);
		 printarr(arr);
		 
		 
	 }
}