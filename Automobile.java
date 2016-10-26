
public class Automobile {
public double milespergallon;
public double gallons;

public Automobile(double mpg){
	gallons=0;
	milespergallon=mpg;
	
}
public void fillUp(double a){
	gallons=gallons+a;
}
public void takeTrip(double m){
	gallons=gallons-(m/milespergallon);
}
public double reportFuel(){
	return gallons;
}

}
