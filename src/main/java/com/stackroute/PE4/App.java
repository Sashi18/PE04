package com.stackroute.PE4;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public String longString(String s) {
		String [] arr = s.split("");
		String fstr = "";
		String str = "";
		int j = 0;
		int c = 0;
		for(int i = 0;i < arr.length;i++) {
			if(str.contains(arr[i]) && (c <= 2)) {
				str += arr[i].trim();
			}
			else if(!str.contains(arr[i]) && (c < 2)) {
				j = i;
				c++;
				str += arr[i].trim();
			}
			else if(!str.contains(arr[i]) && (c == 2)){
				c = 0;
				i = j-1;
				str = "";
			}
			if(str.length() > fstr.length())
				fstr = str;
		}
		return fstr;
	}
	
	public int occur(String s, String r) {
		return (s.length() - s.replaceAll(r,"").length());
	}
	
	public String repAll(String s) {
		return s.replaceAll("d", "f").replaceAll("I", "t");
	}
	
	public String paraSort(String s4){
		s4=s4.replaceAll(" ", "").toLowerCase();
		char [] s5=s4.toCharArray();
		Arrays.sort(s5);
		return (new String(s5));
	}
	
	public String [] transpose(String [] sr){
		 for(int i=0;i<sr.length;i++){
			StringBuilder ob=new StringBuilder();
			ob.append(sr[i]);
			ob.reverse();
			sr[i]=ob.toString();	
		 }
		 return sr;
	}
	
	public String regExp(String s) {
		if(s.contains("Harry")) 
			return "true";		
		else
			return "false";
	}
	
	public String matcher(String s2,String s) {
		Pattern p=Pattern.compile(s);
		Matcher m=p.matcher(s2);
		String s1= "";
		while(m.find()) 
			s1 += (m.start() + "-" + m.end()) + " ";
		return s1.trim();
	}
	
}

	
