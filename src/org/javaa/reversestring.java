package org.javaa;

public class reversestring {
	public static void main(String[] args) {
	String a="sandy";
	String rev="";
for (int i=a.length()-1; i >=0; i--) {
	rev=rev+a.charAt(i);
}
System.out.println(rev);
}
}