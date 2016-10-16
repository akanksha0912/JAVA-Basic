
public class UsingThreeClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add = new Address();
		add.setAddressLine1("House No: 407/A, Nai Basti, B-14, ");
		add.setAddressLine2("Bhardwaj Niwas, near sub post office, ");
		add.setCity("Bijnor, ");
		add.setState("UttarPradesh, ");
		add.setZip("246701.");
		
		PropertyDetails prop = new PropertyDetails();
		prop.setDocumentNo(201);
		prop.setPropertyHolderName("Mr.Vineet Sharma");
		prop.setAddress(add);
		
		HousingLoan hous = new HousingLoan();
		hous.setCustomerID(2000);
		hous.setDuration(20);
		hous.setIntrestRate(2.5f);
		hous.setLoanAmount(50000.0);
		hous.setPropertyDetails(prop);
		hous.setTypeOfIntrest('F');
		
		System.out.println("Customer ID: " + hous.getCustomerID());
		System.out.println("Duration of Loan: "+hous.getDuration());
		System.out.println("Intrest Rate: " + hous.getIntrestRate());
		System.out.println("Loan Amount: " + hous.getLoanAmount());
		System.out.println("Type of Intrest: "+ hous.getTypeOfIntrest());
		
		System.out.println("Name of Property Holder: " + hous.propertyDetails.getPropertyHolderName());
		System.out.println("Address: "+ hous.propertyDetails.address.getAddressLine1()+
				hous.propertyDetails.address.getAddressLine2()+
				hous.propertyDetails.address.getCity()+hous.propertyDetails.address.getState()+
				hous.propertyDetails.address.getZip());
		
		System.out.println("Document Number: " + hous.propertyDetails.getDocumentNo());

	}

}
