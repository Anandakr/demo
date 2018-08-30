package com.sample1.example.sdf;

import org.apache.velocity.tools.generic.LoopTool.Equals;

public class StringToCharJava {

	
	public static void main (String[] args) {
		String str = "1,2,3,456,452,854,5498,21,879,56456,264,546,2658,5546";
		char cc = 0;
		char cc1=0 ;

		// string to char array

		String chars = str.toString();
		System.out.println(chars.length());

		// char at specific index
		for(int i=0;i<chars.length();i++){

		char c = str.charAt(i);
//		System.out.print(c);
//		System.out.println();
		if(c !=',' &&  c != ' ') {
			//System.out.println(c);
			if (c > cc){
				cc = c;
				//System.out.println("The largest number:"+cc);
			}
			if (i==0){
			cc1 = c;
			//System.out.println("------------------------"+cc1);
			}
			if (c < cc1){
				cc1 =c ;
				//System.out.println("smalest number :" +cc1);
			} else {
				//System.out.println("smalest number :" +cc1);
			}
		}
		
		}
		System.out.println("smalest number :" +cc1);
		System.out.println("The largest number:"+cc);
		// this is testing th github
		
}
}
