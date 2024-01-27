package employee.id;

import java.util.Random;

public class CredentialService {
    private static final String COMPANY_NAME = "abc.com";

    public static String generateEmailAddress(Employee employee) {
        String email = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase()
                + "@" + employee.getDepartment().toLowerCase() + "." + COMPANY_NAME;
        return email;
    }

    public static String generatePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:'<>,.?/";

        String allCharacters = capitalLetters + smallLetters + numbers + specialCharacters;

        Random random = new Random();
        StringBuilder password = new StringBuilder();


        password.append(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
        password.append(smallLetters.charAt(random.nextInt(smallLetters.length())));
        password.append(numbers.charAt(random.nextInt(numbers.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

       
        for (int i = 0; i < 6; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        return password.toString();
    }

    public static void showCredentials(Employee employee, String password) {
        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
        System.out.println("Email ---> " + generateEmailAddress(employee));
        System.out.println("Password ---> " + password);
    }
}
