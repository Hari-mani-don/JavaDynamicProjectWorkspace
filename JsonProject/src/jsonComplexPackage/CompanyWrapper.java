package jsonComplexPackage;

import java.util.List;

public class CompanyWrapper {
	private List<Company> companies;

	public CompanyWrapper() {
	}

	public CompanyWrapper(List<Company> companies) {
		super();
		this.companies = companies;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	@Override
	public String toString() {
		return "CompanyWrapper [companies=" + companies + "]";
	}

}
