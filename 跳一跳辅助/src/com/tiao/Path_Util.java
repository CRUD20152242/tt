package com.tiao;

public class Path_Util {
	
	public static String getCurrURL() {
		return System.getProperty("user.dir")+"\\";
	}
	
	public static void main(String[] args) {
		System.out.println(Path_Util.getCurrURL());
	}

}
