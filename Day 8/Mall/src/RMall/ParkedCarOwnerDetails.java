package RMall;

public class ParkedCarOwnerDetails {

	//Instance members
	private String ownerName;
	private String carModel;
	private String carNo;
	private String ownerMobileNo;
	private String ownerAddress;
	

	
	
	
	public ParkedCarOwnerDetails(String ownerName, String carModel, String carNo, String ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {		//getters and setters method
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(String ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	
	
}
