/**
@author Chaz Kerby
*/
package com.chazwarp.JWarpCore.File;

public class FileHelper {
	
	public static String GetBaseSaveDirectory(String prefix) {
		String baseSaveDirectory = null;
		String OS = (System.getProperty("os.name")).toUpperCase();
		
		if(OS.contains("WIN")) {
			baseSaveDirectory = System.getenv("AppData");
		}
		else {
			baseSaveDirectory = System.getProperty("user.home");
			baseSaveDirectory += "/Library/Application Support";
		}
		
		return baseSaveDirectory + prefix;
	}
}
