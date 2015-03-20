package auction;

public abstract class User {

	protected String username;
	protected String password;
	
	public User(){

	}
	
	public Boolean CheckPassword(String pass){
		if(pass.equals(password))
		{
			return true;
		}
		
		return false;
		
	}
	
	public String GetUsername(){
		return username;
	}
}
