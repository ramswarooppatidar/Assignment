package coid_19_vaccination;

 class Availability_of_VaccineDose extends Registration
{
	int varificationCode;
    int dose_availableMorning;
	public void setDose_available(int a) {
		dose_availableMorning = a;
	}
	public int getDose_available(){
		return dose_availableMorning;
	}
	public void genrateVaccineVerificationCode() {
		int min = 10000;
		int max = 99999;
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println("your vaccine verification code is "+b);
		
			}
	public void loginSuccessfully() {
		
	// showInformation();
	 
	}
	public void bookingSlot(int a) {
		 Availability_of_VaccineDose vd = new Availability_of_VaccineDose();
         vd.setDose_available(65);
        // System.out.println("dose avaliale "+vd.getDose_available());
		
		switch(a) {
		case 1: 
			System.out.println("-----slot 9;30AM------");
			int dose = vd.getDose_available();
			System.out.println("total number of dose available is : "+vd.getDose_available());
			System.out.println("your slot is booked successfuly on 9:30am");
		    VaccinationSite obj = new VaccinationSite();
			// Covid_19_loginForVaccination obj = new  Covid_19_loginForVaccination();
		    informationDetail(name,DOB,age);
	
		    obj.adharMobileDetail();;
			genrateVaccineVerificationCode();
			dose--;
			System.out.println("available dose is  "+dose);
		}
			
			
	}

}
