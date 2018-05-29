package main.java.app;

public class PasswordChecker {

    public boolean containsNumber(String password){
        return password.matches(".*\\d+.*");
    }

    public boolean hasUppercase(String password){
        return !password.equals(password.toLowerCase());
    }

    public boolean hasLowercase(String password){
        return !password.equals(password.toUpperCase());
    }

    public boolean checkPassword(String password){
        if(password == null || password.length() < 4 || password.length() > 16){
            return false;
        }
        if(!containsNumber(password)){
            return false;
        }
        if(!hasUppercase(password)){
            return false;
        }
        if(!hasLowercase(password)){
            return false;
        }
        return true;
    }


    public static void main(String a[]){
        PasswordChecker passwordChecker = new PasswordChecker();
        System.out.println("The pass has status " + passwordChecker.checkPassword("MyTest1"));
    }
}
