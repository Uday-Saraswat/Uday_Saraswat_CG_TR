package assignment;

public class StringBuffer_1 {

	public static void main(String[] args) {
		String a="StringBuffer";
        String b="is a peer class of String";
        String c="that provides much of";
        String d="the functionality of strings";
        StringBuffer p=new StringBuffer();
        p.append(a);
        p.append(" "+b);
        p.append(" "+c);
        p.append(" "+d);
        System.out.println(p);

	}

}
