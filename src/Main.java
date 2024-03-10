public class Main {
    public static void main(String[] args) {
        try {
            checkLoginAndPassword("zarplata", "Pupa1", "Lupa2");

        }catch (WrongLoginException | WrongPasswordException e){
            e.printStackTrace();
        }
    }
    public static void checkLoginAndPassword(String login, String password, String confirmPassword) {

        if (login.length() > 20){
            throw new WrongLoginException("Слишком длинный логин.");
        }
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Недопустимые символы.");
        }
        if (password.length() > 20){
            throw new WrongLoginException("Слишком длинный пароль.");
        }
        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Недопустимые символы.");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Несовпадение паролей.");
        }
    }
}