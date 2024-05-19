
package jsonPack2ManojBro;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		CompanyWrapper companyWrapper = mapper.readValue(new File("/home/harimani/HariManiFolder/NewFile01.json"),
				CompanyWrapper.class);
//		Company companyWrapper = mapper.readValue(new File("/home/harimani/HariManiFolder/NewFile01.json"),
//				Company.class);
//		Company company = companyWrapper.getCompany();
		System.out.println(companyWrapper);
	}
}