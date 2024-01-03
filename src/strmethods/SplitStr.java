package strmethods;

public class SplitStr {

	public static void main(String[] args) {
		String s="we are test engineers in marolix";
		String str[]=s.split(" ");
		
System.out.println("first word:"+str[0]);
System.out.println("last word:"+str[str.length-1]);
	}

}
