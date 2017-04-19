
public class ThreadDemo1 {

	public static void main(String[] args) {
		
		MyThread1 m1 = new MyThread1();
		Thread t1 = new Thread(m1);
		
		MyThread1 m2 = new MyThread1();
		Thread t2 = new Thread(m2);
		
		t1.setName("messi");
		t2.setName("robben");
		
		t1.start();
		t2.start();
	}
}
