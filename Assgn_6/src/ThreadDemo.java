
public class ThreadDemo {
	
	public static void main(String[] args) {
		
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		m1.setName("Shubham");
		m2.setName("Ronaldo");
		//m1.setPriority(10);
		m1.start();
		
		m2.start();
	}

}
