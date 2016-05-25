
public class Clinic{
private final Client [] clients;
public Clinic (final int size){
	this.clients=new Client[size];
}
public void addClient (final int position, final Client client ){
	this.clients[position]=client;
}
public Client getClient	(final int position){
	return this.clients[position];
}
}