 package ss.design2b;

public class Hello {
	
	public static final String HELLO = "Hello sir";
	
	public static void main(String[] args) {
	System.out.println(HELLO + "Why?");
	}
	
	public String getHello() {
		return HELLO;
	}
	
	public String shutUp() {
		return "Go away!";
	}
	
	public String respondtoShutUp() {
		return "No, go away yourself!";
	}

	public String different() {
		return "This is different right";
	}
	
	
}
