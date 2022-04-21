package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Array {
	
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader= new FileReader("C:\\Users\\DX MUTHU\\eclipse-workspace\\JSONproject\\src\\test\\resources\\project.json");
		JSONParser jsonparser = new JSONParser();
		Object obj = jsonparser.parse(reader);
		JSONObject jsonobject=(JSONObject)obj;
		Object page=jsonobject.get("page");
		System.out.println(page);
		Object per_page=jsonobject.get("per_page");
		System.out.println(per_page);
		Object total=jsonobject.get("total");
		System.out.println(total);
		Object total_page=jsonobject.get("total_page");
		System.out.println(total_page);
		
		System.out.println("***************************");
		
		Object objData=jsonobject.get("data");
		JSONArray a =(JSONArray)objData;
		for (int i = 0; i < a.size(); i++) {
			Object c = a.get(i);
			JSONObject eachData =(JSONObject)c;
			Object id =eachData.get("id");
			System.out.println(id);
			Object first_name=eachData.get("first_name");
			System.out.println(first_name);
			Object last_name=eachData.get("last_name");
			System.out.println(last_name);
			Object email=eachData.get("email");
			System.out.println(email);
			Object avatar =eachData.get("avatar");
			System.out.println(avatar);
			
			System.out.println("*************************");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
