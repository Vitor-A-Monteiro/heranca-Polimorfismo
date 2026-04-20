package entities;

public class outsourceEmployee extends Employee {
	
	private Double additionalCharge;

	public outsourceEmployee(String name,double hours, double valuePerHour2, Double valuePerHour) {
		super();
		this.additionalCharge = additionalCharge;
		
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	 public Double payment() {
		 return super.payment() + additionalCharge*1.1;
	 }

}
