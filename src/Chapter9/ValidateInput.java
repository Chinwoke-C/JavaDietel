package Chapter9;

public class ValidateInput {
    public static boolean validateFirstName(String firstname){
        return firstname.matches("[A-Z][a-zA-Z]*");
    }
    public  static boolean validateLastName(String lastname){
        return lastname.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }
    public static boolean validateSocialSecurity(String SSN){
        return SSN.matches("[1-9]\\d{2}-[1-9]\\d-{4}");
    }
}
