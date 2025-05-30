package demo;

abstract class abstractexample1 {
	
	abstract void ATM();

}
class bank extends abstractexample1 {
	void ATM()
	{
		System.out.println("ATM Machine");
	}
}
public class abstractexample{
	public static void main(String[] args) {

	bank b = new bank();
	b.ATM();
}
}
