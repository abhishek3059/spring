
public class FindMyDeviceService {
  

    public boolean validateUsername(String userName) throws InvalidDataException {
        if(userName.length() >= 5 || userName.length() <= 20) {return true;}
        else throw new InvalidDataException("Username must be between 5 and 20 characters");

        
    }

    public boolean validatePassword(String password) throws InvalidDataException{
        if(password.length()  > 8 && !password.matches("[A-Z]+[0-9]+[!@#$%^&*]+.")) 
         throw new InvalidDataException("Password must be at least 8 character long and include at least one digit, one uppercase letter, and one specialCharacter");
        
    }

    public boolean validateDeviceId(String deviceId) throws InvalidDataException {
        if(deviceId.matches("[A-Za-z0-9]") && deviceId.length() == 10) {return true;}
        else throw new InvalidDataException("Device ID must be 10 alphanumeric characters");
       
    }

    public boolean validateLocationCoordinates(double latitude, double longitude) throws InvalidDataException {
       if((latitude >= -90 || latitude <= 90) && (longitude >= -180 || longitude <= 180)) {return true;}
       else throw new InvalidDataException("Invalid coordinates: Latitude must be between -90 and 90, Latitude must be between -90 and 90, Longitude must be between -180 and 180");

        
    }

    

    
}
