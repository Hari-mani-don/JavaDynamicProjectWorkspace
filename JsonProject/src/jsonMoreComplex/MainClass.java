package jsonMoreComplex;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MainClass {

	private static Employee employee;

	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper ob = new ObjectMapper();

		CompanyWrapper value = ob.readValue(new File("/home/harimani/HariManiFolder/complexJson.json"),
				CompanyWrapper.class);
		System.out.println(value);

		ObjectWriter writer = ob.writer(SerializationFeature.INDENT_OUTPUT);
		String s = writer.writeValueAsString(value);
		System.out.println(s);
	}
}
