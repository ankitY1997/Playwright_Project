package com.utills.reusablecomponents;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ExcelOperation {

	public static Properties pro = new Properties();

	public static String readDataFromProperties(String key) {
		String value = null;
		try {
			pro.load(new FileInputStream(
					System.getProperty("user.dir") + ".\\src\\main\\resources\\Configuration\\config.properties"));
			value = pro.getProperty(key);
		} catch (Exception e) {
			System.out.println("Invalid properties file key: " + key + ". Please enter a valid key." + " Error Is"
					+ e.getMessage().toString());
			return value;
		}
		return value;
	}

}
