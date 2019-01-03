package pratice_01;

public class Test_10 {

	public static void main(String[] args) {
		String s1="999999999999999999999999999999999999999999999";
		String s2="888888888888888888888888888888888888";
		int a = 0, result = 0;
		String b = " ";
		for (int i = 0; i < s1.length(); i++) {
			if(i<s2.length())
				a=s2.charAt(i)-'0';
			else
				a=0;
			result=s1.charAt(i)+a-'0'+result;
			b=result%10+b;
			result=result/10;
		}
		System.out.println(result+b);
	} 
	/*	������ Ǯ��
	  private static String add(String s1, Strings2){
	  String result = "", zeros="";
	 
	  for(int i=0; i<Math.abs(s1.length()-s2.length()); i++){
	  zeros = zeros+'0'; }
	  if(s1.length()<s2.length())s1 = zeros+s1;
	  else s1=zeros+s2
	  int carry=0;
	  for(int i = s1.length()-1; i>=0; i--){
	  int v=s1.charAt(i)-'0' + s2.CharAt(i) = '0'+carry;
	  carry = v/10;
	  result = v%10+result;
	  if(carry>0)result = carry+result;
	  return result;
	 */
	

}
