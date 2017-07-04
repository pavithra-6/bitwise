package sumave1;

public class Swapusingbitwise {

	public static void main(String[] args) {
		int g=10,f=20;
		System.out.println("before swapping :"+g);
		System.out.println("before swapping :"+f);
		g=g^f;
		f=g^f;
		g=g^f;
		System.out.println("after swapping:"+g);
		System.out.println("after swapping:"+f);
	}

}
