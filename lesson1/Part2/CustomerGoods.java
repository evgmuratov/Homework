public abstract class CustomerGoods 	{
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
	
public payMoney(int=newPrice) 
			{price=newPrice} //buy
public sendTo(String=newAddress) 
			{address=newAddress} //send
public receive() {}
public fix() {}
public use() {}
public move() {}
private check(boolean=isGarrantyNew) 
			{isGarranty=isGarrantyNew}
abstract storage() {}
public open() {}
abstract test() {} //first try to use
							}