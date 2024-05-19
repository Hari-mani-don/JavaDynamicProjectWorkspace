package jsonComplexPackage;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MainClass {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper ob = new ObjectMapper();

		CompanyWrapper company = ob.readValue(new File("/home/harimani/HariManiFolder/ComplexLess.json"), CompanyWrapper.class);
		
		System.out.println(company);

		ObjectWriter writer = ob.writer(SerializationFeature.INDENT_OUTPUT);

		String s = writer.writeValueAsString(company);
		System.out.println(s);
	}
}
