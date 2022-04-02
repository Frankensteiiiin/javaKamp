package Entities;

public class Campaign {
	private int id;
	private int campaignAmount;
	
	public Campaign() {
		super();
	}
	public Campaign(int id, int campaignAmount) {
		super();
		this.id = id;
		this.campaignAmount = campaignAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCampaignAmount() {
		return campaignAmount;
	}
	public void setCampaignAmount(int campaignAmount) {
		this.campaignAmount = campaignAmount;
	}
	
}
