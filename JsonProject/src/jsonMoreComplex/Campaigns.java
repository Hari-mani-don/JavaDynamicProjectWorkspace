package jsonMoreComplex;

import java.util.List;

public class Campaigns {
	private String campaignId;
	private String campaignName;
	private int budget;
	private List<String> platforms;
	private String startDate;
	private String endDate;

	public Campaigns() {
	}

	public Campaigns(String campaignId, String campaignName, int budget, List<String> platforms, String startDate,
			String endDate) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.budget = budget;
		this.platforms = platforms;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public List<String> getPlatforms() {
		return platforms;
	}

	public void setPlatforms(List<String> platforms) {
		this.platforms = platforms;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Campaigns [campaignId=" + campaignId + ", campaignName=" + campaignName + ", budget=" + budget
				+ ", platforms=" + platforms + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
