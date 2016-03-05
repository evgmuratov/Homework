public class CustomerGoods 	{
	String color;
	String type; // food, digital devices, clothes, cleaning, beauty
	boolean isFastExpired;
	int weight;
	String packageType;
	boolean isFragile;
	String stateOfProducing;
	boolean isGarranty;
	boolean isSaleInCredit;
	int envTemparature;
	int dateOfProduceing;
	int price;
	String address;
	
public int payMoney(int newPrice) 
			{price=newPrice} //buy
public String sendTo(String newAddress) 
			{address=newAddress} //send
public boolean receive() {}
public String fix() {}
public String use() {}
public int move() {}
private boolean check(boolean isGarrantyNew) 
			{isGarranty=isGarrantyNew}
public int storage() {}
public String open() {}
public String test() {} //first try to use
							}