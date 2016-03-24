package com.hui.demo.junitdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {

		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Input Your Username：");
		String username = strin.readLine();
		System.out.println("Please Input Your Password：");
		String password = strin.readLine();
		System.out.println("Username：" + username);
		System.out.println("Password：" + password);
		
	}
	
	public boolean checkAccount(String name, String pwd){
		if("grey".equals(name)&&"1989927".equals(pwd)){
			return true;
		}else{
			return false;
		}
	}
}
