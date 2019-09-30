
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Variable v=new Variable();
		System.out.println(v.getVar());
		
		VariableIncThread ti1=new VariableIncThread(v);
		VariableIncThread ti2=new VariableIncThread(v);
		VariableIncThread ti3=new VariableIncThread(v);
		
		VariableDecThread td1=new VariableDecThread(v);
		VariableDecThread td2=new VariableDecThread(v);
		VariableDecThread td3=new VariableDecThread(v);
		
		ti1.start(); ti2.start(); ti3.start();
		td1.start(); td2.start(); td3.start();
	
		// Thread Priority ?
		
		ti1.join(); ti2.join(); ti3.join();
		td1.join(); td2.join(); td3.join();
		
		// join(), wait(), notify(), nitifyAll(), sleep(), resume(), suspend()
		
		System.out.println(v.getVar());
		
		//deamon threads
	
	}

}

class VariableIncThread extends Thread{
	
	Variable vObj=null;
	
	public VariableIncThread(Variable temp) {
		vObj=temp;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		vObj.inc();
	}
}

class VariableDecThread extends Thread{
	
	Variable vObj=null;
	
	public VariableDecThread(Variable temp) {
		vObj=temp;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		vObj.dec();
	}
}



class Variable{
	private int var=0;
	
	// JVM Monitor
	// synchronized block
	 public int getVar() {
		 synchronized (this) {
			 return var;
		 }
	}
	 // synchronized method
	synchronized public void setVar(int var) {
		this.var = var;
		
	}
	
	public void inc() {
		setVar(getVar()+1);
	}
	
	public void dec() {
		setVar(getVar()-1);
	}
	
}