package jsonPack;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonToJava {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		try {
			
//			ObjectMapper mapper = new ObjectMapper();
//			System.out.println("hari");
//			Employee e = mapper.readValue(new File("/home/harimani/jsonDataFolder/hari.txt"), Employee.class);
//			System.out.println(e);
//			
			Employee em = new Employee();
//			String s =mapper.writeValueAsString(e);
//			
//			System.out.println(s);
//			
			
			Gson g = new Gson();
//		Employee e1=	g.fromJson(new FileReader("/home/harimani/jsonDataFolder/hari.txt"), Employee.class);
//		System.out.println(e1);
		
		String s =g.toJson(em);
		System.out.println(s);
		
		
		} catch (Exception e) {

			System.out.println(e);
		}

//
//		Employee e1 = new Employee();
//		Employee e = new Employee();
//		FileOutputStream fos = new FileOutputStream("/home/harimani/jsonDataFolder/emploee.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(e1);
//		oos.writeObject(e);
//
//		FileInputStream fis = new FileInputStream("/home/harimani/jsonDataFolder/emploee.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		System.out.println(ois.readObject());

	}

}
