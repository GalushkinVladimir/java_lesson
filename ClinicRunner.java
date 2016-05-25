public class ClinicRunner{
	public static void main (String [] arg){
		final Clinic clinic=new Clinic(10);
		clinic.addClient(0,new Client ("qwer","asdf") );
		System.out.println("Clinic="+clinic.getClient(0).getId()+" "+clinic.getClient(0).getName());
	}
	
}