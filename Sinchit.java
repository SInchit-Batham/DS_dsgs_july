
public class Sinchit {

	public static void main(String[] args) {
		Conversions c=new Conversions();
		c.dollartorupee();
		float x=c.metertocm();
		System.out.println("10.5 meter to cm is "+ x);
		c. celiustofaherenhit(32.5);
		c. decimaltobinary(5);

	}

}

class Conversions{
	void dollartorupee()
	{
		int dollar=100;
		int rupee;
		rupee= dollar*80;
		System.out.println("100 dollar is equalivalent to "+ rupee +" rupeee");
	}
	float metertocm()
	{
		float x=(float) 10.5;
		float cm=x*100;
		return cm;
	}
	double celiustofaherenhit(double c)
	{
		double f;
		f = (c * 1.8) + 32;  
		 
		 System.out.println("value of temperature 32.5 celius in fahrenheit:"+ f);
		 return f;
		 
	}
	void decimaltobinary(int x)
	{
		System.out.println("Binary representation of 5 : "+ Integer.toBinaryString(x));
	}
}
