import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) throws InvalidDataException {
    	try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = sc.next();
        System.out.println("Enter your password");
        String password = sc.next();
        System.out.println("Enter your device ID:");
        String deviceId = sc.next();
        System.out.println("Enter the latitude");
        double latitude = sc.nextDouble();
        System.out.println("Enter the longitude:");
        double longitude = sc.nextDouble();
        FindMyDeviceService fs = new FindMyDeviceService();
        if(fs.validatePassword(password)&&fs.validateUsername(username)&&fs.validateLocationCoordinates(latitude, longitude)&&fs.validateDeviceId(deviceId)) {
        	System.out.println("All validations passed successfully!");
        	System.out.println("Your device information is now secured and validated");
        }
    }
    	catch(InvalidDataException e) {
    		System.out.println(e.getMessage());
    	}
}}
