package assignment;

public class StringBuilder_1 {

	public static void main(String[] args) {
		String a="StringBuffer";
        String b="is a peer class of String";
        String c="that provides much of";
        String d="the functionality of strings";
		StringBuilder q=new StringBuilder();
        q.append(a);
        q.append(" "+b);
        q.append(" "+c);
        q.append(" "+d);
        System.out.println(q);

	}

}
