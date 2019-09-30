import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static boolean inputEntered=false; 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*System.out.println("START");

		Task1 t1=new Task1();
		Task2 t2=new Task2();

		t1.start();
		t2.start();



		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}

		for(int i=11;i<=20;i++) {
			System.out.println(i);
		}

		System.out.println("END");
		 */	

		System.out.println("Enter a string");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		new Thread() {
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(5*1000);
						if(!Main.inputEntered) {
							System.out.println("Time out");
							System.exit(0);
						}
						else {
							System.out.println("Thanks for the input");
						}
					}catch(Exception e) {
						
					}
				}
			}.start();
		
		String str=br.readLine();
		Main.inputEntered=true;
		System.out.println("The uppercase of the input:"+str.toUpperCase());
	}
}

class Task1 extends Thread{

	public void run() {
		for(int i=1;i<=10;i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i);
		}
	}
}

class Task2 extends Thread{

	public void run() {
		for(int i=11;i<=20;i++) {

			try {
				Thread.sleep(1000*60*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

			System.out.println(i);
		}
	}
}


