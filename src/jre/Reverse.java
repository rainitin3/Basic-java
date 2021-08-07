package jre;

public class Reverse {
	public static void main(String[] args) {
		String s = "ram";
		s=s.concat("kumar");
		
		System.out.println(s);

		StringBuffer sb = new StringBuffer("ram");//String Buffer is mutable
		sb.append("kumar");
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder stb= new StringBuilder("ram");//StringBuilder is mutable
		stb.append(" kumar");
		stb.reverse();
		System.out.println(stb);
	}

}
