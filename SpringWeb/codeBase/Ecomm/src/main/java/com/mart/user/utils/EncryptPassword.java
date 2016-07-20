package com.mart.user.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptPassword {
	
	public static StringBuffer getHashedPassKey(String msg){
		
		MessageDigest md;
		
		StringBuffer encryptMsg = null ;
		try {
		
			md = MessageDigest.getInstance("SHA-256");
			
			md.update(msg.getBytes());
		    
			byte byteData[] = md.digest();
		      //convert the byte to hex format method 1
			encryptMsg = new StringBuffer();
		    
		    for (int i = 0; i < byteData.length; i++) {
		        
		    	encryptMsg.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		    }
		  //  System.out.println("Hash Code is "+ encryptMsg.toString());
		} 
		catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return encryptMsg;
		
	}

}
