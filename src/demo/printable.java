package demo;
interface printable1{
	void print();
}
class message implements printable1{
	public void print()
	{
		System.out.println("Hello from interface ");
	}
}
public class printable {

	public static void main(String[] args) {
		message msg = new message();
		msg.print();

	}

}
