package firstjava11;

public class patient{
	
	
	double computeBMI(double wt,double ht)
	{ 
		
		return (wt/(ht*ht));
	}
	


	public static void main(String[] args) {
		patient em=new patient();
		System.out.println(em.computeBMI(5,33));
		System.out.println(em.computeBMI(3,33));
	
	}

}
