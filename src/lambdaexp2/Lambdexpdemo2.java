package lambdaexp2;

interface Cab{
	public void bookCab(String source , String destination); 
		
	
}



public class Lambdexpdemo2 {
	public static void main(String[] args) {
		
		Cab cab = ( source, destination )->System.out.println("ola cab is booke from "+source +"to "+destination);
		cab.bookCab("hyd", "delhi");
	}

}
