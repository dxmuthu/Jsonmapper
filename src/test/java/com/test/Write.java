package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Write {
	
	public static void main(String[] args)  throws Exception {
		
		File f = new File("C:\\Users\\DX MUTHU\\eclipse-workspace\\JSONproject\\src\\test\\resources\\write.json");
		
		ObjectMapper m = new ObjectMapper();
		
		List<Datum>datum = new ArrayList<Datum>();
		Datum d1=new Datum(10, "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg");
		Datum d2=new Datum(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg");
		Datum d3=new Datum(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
		Datum d4=new Datum(10, "byron.fields@reqres.in", "Byron", "Fields", "https://reqres.in/img/faces/10-image.jpg");
		Datum d5=new Datum(11, "george.edwards@reqres.in", "George", "Edwards", "https://reqres.in/img/faces/11-image.jpg");
		Datum d6=new Datum(12, "rachel.howell@reqres.in", "Rachel", "Howell", "https://reqres.in/img/faces/12-image.jpg");
		
		datum.add(d1);
		datum.add(d2);
		datum.add(d3);
		datum.add(d4);
		datum.add(d5);
		datum.add(d6);
		
		Support s = new Support("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
		Root r = new Root(2, 6, 23, 2, datum, s);
		m.writeValue(f, r);
		
		
		
		
		
	}

}
