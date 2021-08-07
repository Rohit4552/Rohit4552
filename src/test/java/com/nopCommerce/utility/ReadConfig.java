package com.nopCommerce.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	// why we have created read config because to read the value
	//there  we need to crete one object of properties class
	
	Properties pro;//there is a predefined class, and this object intalized in the method
	
	public ReadConfig() {
		
		File src= new File("./Configuration//config.properties");// load the file , first we craete the file object,then specfied the location
		//(./reperesent the cureent project directory)
		//src= represent the location of file
		
		try {
			FileInputStream fis= new FileInputStream(src);//file input stream  a class which can be used whenever  we want read some data
			//-- from the file
			
			
			pro= new Properties();// this pro object intialized here 
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is"+e.getMessage());
			// why we haqve used try catch
		}//--because supoose i did not create the configaratin file, so load the file give file not exception
		
	}
	
	//based of the number of variable avialble in  configuration file, so will create 4 method
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUseremail()
	{
	String username=pro.getProperty("useremail");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getchromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}
	
	
	
}

	