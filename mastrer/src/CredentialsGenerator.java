import java.util.Random;

public class CredentialsGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LOGIN_LENGTH = 8;
    private static final int PASSWORD_LENGTH = 10;

    public static void main(String[] args) {
        String login = generateLogin();
        String password = generatePassword();

        System.out.println("Сгенерированный логин: " + login);
        System.out.println("Сгенерированный пароль: " + password);
    }

    public static String generateLogin() {
        return generateRandomString(LOGIN_LENGTH);
    }

    public static String generatePassword() {
        return generateRandomString(PASSWORD_LENGTH);
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }

        return sb.toString();
    }
}
