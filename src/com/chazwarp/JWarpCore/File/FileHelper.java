/**
@author Chaz Kerby
*/
package com.chazwarp.JWarpCore.File;

public class FileHelper {
	
	public static String getSaveDirectory(String subdirectory) {
		String baseSaveDirectory = null;
		String OS = (System.getProperty("os.name")).toUpperCase();
		
		if(OS.contains("WIN")) {
			baseSaveDirectory = System.getenv("AppData");
			return baseSaveDirectory + "\\" + subdirectory;
		}
		else {
			baseSaveDirectory = System.getProperty("user.home");
			baseSaveDirectory += "/Library/Application Support";
			
			return baseSaveDirectory + "/" + subdirectory;
		}
	}
	
	public static String getSaveDirectory(String subdirectory, String filename) {
		String baseSaveDirectory = null;
		String OS = (System.getProperty("os.name")).toUpperCase();
		
		if(OS.contains("WIN")) {
			baseSaveDirectory = System.getenv("AppData");
			
			return baseSaveDirectory + "\\" + subdirectory + "\\" + filename;
		}
		else {
			baseSaveDirectory = System.getProperty("user.home");
			baseSaveDirectory += "/Library/Application Support";
			
			return baseSaveDirectory + "/" + subdirectory + "/" + filename;
		}
	}
}
