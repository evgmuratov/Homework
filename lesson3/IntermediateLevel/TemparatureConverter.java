package IntermediateLevel;

public class TemparatureConverter {
	public static double convertToCelsius(double temp){
		double cels=temp-273.15;
		return cels;
	}
	public static void convertToKelvin(double temp){
		double kelv;
		if (temp<-273.15){
			System.out.println("-273,15 Celsius is min temparature that could be converted to Kelvin. It equals to absolut zero in Kelvin");
		}else{
		kelv=temp+273.15;
		System.out.println("Temparature "+temp+"C in Kelvin equals "+kelv+"K");
		}
		}

	public static void main(String[] args) {
		TemparatureConverter.convertToKelvin(-283.15);
		double newKelv=301.05;
		double convCels=TemparatureConverter.convertToCelsius(newKelv);
		System.out.println("Temparature "+newKelv+"K in Celsius equals "+convCels+"C");

	}

}
