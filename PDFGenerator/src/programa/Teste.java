package programa;

public class Teste {
	
	public static void main(String[] args) throws InterruptedException {
	
		Programa p1 = new Programa();
		p1.setId(1);
		
		Thread t1 = new Thread(p1);
		t1.start();
		//Thread.sleep(3*2000);

		Programa p2 = new Programa();
		p2.setId(2);

		Thread t2 = new Thread(p2);
		t2.start();

	}

}
