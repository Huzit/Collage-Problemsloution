package pratice_06;

public class Test_21 {
	public static void main(String[]args) {
		String s[]= {"����", "�뱸", "�λ�"};
		swap(s, 0);
	}
	private static void swap(String[]s, int i) {
		if(i==s.length) {
			for(String name : s)
				System.out.print(name);
			System.out.println();
			return;
		}
		for(int j=i; j<s.length; j++) {
			String temp=s[i]; s[i]=s[j]; s[j]=temp;
			swap(s, i+1);
			temp=s[i]; s[i]=s[j]; s[j]=temp;
		}
	}
}