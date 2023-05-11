package lambdaexp;

/*
 * 1)function programing feature.
 * 2)codeoptimize / wirite lesscode.
 * 3)Ananymons function
 *  a)name -not name less function
 *  b) return type -not
 *  c)no teturn.
 *  d) no accessmodifier.
 */

 
@FunctionalInterface
interface Cab{
	public void bookCab();
}


	

public class LambdaexpDemo {
	
		
	
	public static void main(String[] args) {
		Cab cab= ()->System.out.println("hello world");
		cab.bookCab();
	}

}
