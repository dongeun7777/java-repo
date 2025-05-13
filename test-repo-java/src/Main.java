
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String userInput = "ls";  // 취약한 하드코딩된 값

        // Command Injection 취약점 예시
        Process process = Runtime.getRuntime().exec(userInput);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // 하드코딩된 비밀번호 (취약점)
        String dbPassword = "superSecret123";
        System.out.println("DB Password: " + dbPassword);
    }
}
