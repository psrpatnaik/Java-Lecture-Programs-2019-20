public class Main {

	public static void main(String[] args) {

		int x=0;
		int y=10;
		
		/*System.out.println("Hello");
		int[] intarray= new int[3];
		try {
			intarray[5]=1;
			System.out.println(y/x);
		}

		catch(ArithmeticException ae) {
			System.out.println("AE");
		}
		catch(Exception e) {
			System.out.println("Exception");
			//e.printStackTrace();
		}
		 */

		try {
			System.out.println(y/x);
		}
		finally {

			try {
				System.out.println(y/x);
			}
			catch (ArrayIndexOutOfBoundsException e) {

			}
			System.out.println("Finally");	
		}

		/*catch(ArrayIndexOutOfBoundsException aio) {
			System.out.println("AIO");
		}*/

		System.out.println("World");
	} // Main end
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub

	}
}
// compiled C , C++ 
// interpreted Java