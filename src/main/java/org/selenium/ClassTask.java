package org.selenium;

import java.util.ArrayList;
import java.util.List;

public class ClassTask {
	public static void main2(String[] args) {
		String s = "career Guidence technology";
		List<Character> input = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c);
			input.add(c);			
		}
		System.out.println(input);
		if (input.get(3).equals('e')) {
			System.out.println("e i present");
		}
		else {
			System.out.println("e is not present");
		}

	}
}

//pacakge org.test;
//public Class Example{
//public static void main(String[] args){
//
//String s ="carrier guidance";
//int len=s.length();
//for(int i=0; i<len; i++){
//char c=s.charAt(i);
//System.out.println(c);
//}
//List<Character> l = new LinkedList<Character>(c);
//System.out.println(l);
//char a=l.get(3);
//System.out.println("print the 3 index"+a);//it prints r
//if('e'.equals(l)){
//System.out.println("'e' is present");
//}
//else{
//System.out.println("'e' is not present");
//}
//}
