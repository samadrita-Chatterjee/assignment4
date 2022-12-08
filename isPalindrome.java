
public class isPalindrome {
	public static boolean checkPalindrome(String str)
	{
		String revstr ="";
		boolean check =false;
		for(int i =str.length() - 1;i>=0;i--) {
			revstr= revstr + str.charAt(i);
		}
		if(str.contentEquals(revstr)) {
			check =true;
		}
		return check;
	}

	

	public static void main(String[] args) {
		String str ="2552";
		str =str.toLowerCase();
		boolean B =checkPalindrome(str);
		System.out.println(B);

	}

}
