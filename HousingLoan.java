
public class HousingLoan {
	private int customerID;
	private int duration;
	private float intrestRate;
	private double loanAmount;
	private char typeOfIntrest;
	protected PropertyDetails propertyDetails;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public float getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(float intrestRate) {
		this.intrestRate = intrestRate;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public char getTypeOfIntrest() {
		return typeOfIntrest;
	}
	public void setTypeOfIntrest(char typeOfIntrest) {
		this.typeOfIntrest = typeOfIntrest;
	}
	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}
	public void setPropertyDetails(PropertyDetails prop) {
		propertyDetails = prop;
	}
	

}
