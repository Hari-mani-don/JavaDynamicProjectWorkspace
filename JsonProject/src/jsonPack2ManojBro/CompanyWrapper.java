package jsonPack2ManojBro;

public class CompanyWrapper {
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

	@Override
	public String toString() {
		return "CompanyWrapper [company=" + company + "]";
	}
    
}
