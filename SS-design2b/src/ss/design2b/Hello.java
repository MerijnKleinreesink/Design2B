package ss.design2b;

public class Hello {
	
	public static final String HELLO = "Hello";
	
	public static void main(String[] args) {
	System.out.println(HELLO + "Why?");
	}
	
	public String getHello() {
		return HELLO;
	}
	
	public String shutUp() {
		return "Go away!";
	}
}
