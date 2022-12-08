
public class DuplicateCharacters {

	public static void main(String[] args) {
		String str ="samadrita";
		int count;
		char String[] =str.toCharArray();
		System.out.println("Duplicate characters in this given String ");
		for(int i=0;i<String.length;i++) {
			count =1;
			for(int j=i+1;j<String.length;j++) {
				if(String[i]==String[j]) {
					count++;
					String[j] ='0';
				}
			}
			if(count>1 && String[i]!='0')
				System.out.println(String[i]);
		}

	}

}
