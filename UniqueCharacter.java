
public class UniqueCharacter {
	boolean checkUniqueCharacter(String str)
	{
		for(int i= 0;i<str.length();i++)
			for(int j= i+1; j<str.length(); j++)
				if(str.charAt(i) == str.charAt(j))
					return false;
		return true;

	}


	public static void main(String[] args) {
		UniqueCharacter obj =new UniqueCharacter();
		String str ="SamadritaChatterjee";
		if(obj.checkUniqueCharacter(str))
			System.out.println("This string "+ str +"has all unique characters");
		else
			System.out.println("This string "+ str +"has repeated characters");
		
		
	}

}


	