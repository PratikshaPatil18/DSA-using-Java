class subset
{
public static void findsubset( String str, String ans, int idx)
{   //base case
	if(idx == str.length())
	{
		System.out.println(ans);
		return;
	}
	// for yes choice
	findsubset(str, ans+str.charAt(idx),idx+1);
	// for no choice
	findsubset(str,ans,idx+1);
}
public static void main(String args[])
{
	String str= "abc";
	findsubset(str, " ",0);
}
}