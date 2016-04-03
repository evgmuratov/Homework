package IntermediateLevel;

public class TemparatureConverter {
	public double convertToCelsius(double temp){
		double cels=temp-273.15;
		return cels;
	}
	public double convertToKelvin(double temp){
		double kelv=temp+273.15;
		return kelv;
	}

	public static void main(String[] args) {
		TemparatureConverter myTemp=new TemparatureConverter();
		double newCels=15.00;
		double convKelv=myTemp.convertToKelvin(newCels);
		double newKelv=301.05;
		double convCels=myTemp.convertToCelsius(newKelv);
		System.out.println("Temparature "+newCels+"C in Kelvin equals "+convKelv+"K");
		System.out.println("Temparature "+newKelv+"K in Celsius equals "+convCels+"C");

	}

}
