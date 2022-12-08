
public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str ="programming";
		char[] arr=str.toCharArray();
		StringBuilder sb1=new StringBuilder();
		for( int i =0;i<arr.length;i++) {
			boolean repeated =false;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeated =true;
					break;
				}
				
			}
			if(!repeated) {
				sb1.append(arr[i]);
			}
			
		}
		System.out.println(sb1);

	}

}
