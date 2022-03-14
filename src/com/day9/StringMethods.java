package com.day9;

public class StringMethods {
	public static void main(String[] args) {
		
		String s = "Help ever";
		String s1 = "Hurt never";
		
  char t = s.charAt(8);
  System.out.println(t);
  
  boolean u = s1.startsWith("h");
  System.out.println(u);
  
  CharSequence g = s.subSequence(1,5);
  System.out.println(g);
  
  int h = s1.indexOf('n');
  System.out.println(h);
  
  
  
	}

}
