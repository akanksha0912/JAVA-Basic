
public class PropertyDetails {
	private String propertyHolderName;
	protected Address address;
	private int documentNo;
	public String getPropertyHolderName() {
		return propertyHolderName;
	}
	public void setPropertyHolderName(String Property) {
		propertyHolderName = Property;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getDocumentNo() {
		return documentNo;
	}
	public void setDocumentNo(int documentNo) {
		this.documentNo = documentNo;
	}
	

}
