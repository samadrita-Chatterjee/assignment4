
public class Panagram {
	public static boolean checkPanagram(String str)
	{
		boolean[] b=new boolean[26];
		int index = 0;
		
		for(int i = 0;i<str.length();i++) {
			if('A'<=str.charAt(i) && str.charAt(i) <='Z')
				index =str.charAt(i) -'A';
			else if('a' <=str.charAt(i) && str.charAt(i) <='z')
				index =str.charAt(i)-'a';
			else
				continue;
			b[index] =true;
				
				
		}
		for(int i =0;i<=25;i++)
			if(b[i] == false )
				return (false);
		return (true);
	}

	public static void main(String[] args) {
		String str="we promptly judge antique ivory buckles for the next prize";
		if (checkPanagram(str) == true)
			System.out.print(str +"\nis a panagram");
		else
			System.out.print(str + "\nis not a panagram");

	}

}
