

public class contructor {
	private String girlName;
	public contructor(String name){
		girlName = getName();
	}
	public void setName(String name){
		girlName = name;
	}
	public String getName(){
		return girlName;
		
	}
	public void saying(){
		System.out.printf("your first girlfriend was %s", getName());
		
	}
}
	

