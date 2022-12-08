
public class A {
	static void countCharacterType(String str) {
		int vowels = 0, consonant =0,specialChar =0, digit =0;
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if ((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')){
				ch =Character.toLowerCase(ch);
				if(ch=='a'||ch == 'e' || ch == 'i'|| ch == 'o'||ch =='u')
					vowels++;
				else
					consonant++;
				
			}
			else if(ch>='0' && ch <='9')
				digit++;
			else
			     specialChar++;
			
		}
		
		System.out.println(" Number of Vowels: " +vowels);
		System.out.println(" Number of Consonants: " + consonant);
		System.out.println(" Number of SpecialCharacters: " +specialChar);
		System.out.println(" Number of digits: " + digit);
	}

	public static void main(String[] args) {
		String str ="samadritachatterjee@#89";
		countCharacterType(str);

	}

}
