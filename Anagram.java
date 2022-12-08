import java.util.Arrays;

public class Anagram {
	static boolean areAnagram(char[] str1,char[]str2) {
		int s1 =str1.length;
		int s2=str2.length;
		
		if(s1 != s2)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<s1 ;i++)
			if(str1[i]!= str2[i])
				return false;
		return true;
	}
	

	public static void main(String[] args) {
		char str1[]= {'k','a','a','b'};
		char str2[]= {'a','b','b'};
		
		if (areAnagram(str1,str2))
			System.out.println("This two string are anagram to each other");
		else
			System.out.println("This two string are anagram to each other");
		

	}

}
