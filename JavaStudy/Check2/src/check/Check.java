package check;
import constants.Constants;

public class Check {
	
	private String firstName = "shoichi";
	private String lastName = "furuyama";
	

    public static void main(String[] args) {
    	
    	System.out.println("printNameメソッド→"+printName("古山","将一"));
    	
    	Pet i = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
    	
    	i.introduce();
    	
    	RobotPet u = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
    	
    	u.introduce();
    }
    private static String printName (String firstName,String lastName) {
    	String fullName=firstName+lastName;
    	return fullName;
    	
    	
    }
    
    }