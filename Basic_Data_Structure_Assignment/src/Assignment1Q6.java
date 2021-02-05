import java.util.Scanner;

class Login{
    String userId = "Ajay", password = "password";
    static int attempt = 1;
    public String loginUser(String user, String pass){
        String s = "";
        if(attempt < 3){
            if(user.equals(userId) && pass.equals(password)){
                return "Welcome " + userId;
            }else {
                System.out.println("You have entered wrong credentials ,please enter the right credentials.");
                attempt += 1;
                getInput();
            }
        }else {
            s = "You have entered wrong credentials " + attempt +" times.\nContact Admin";
        }
        return s;
    }

    void getInput(){
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pass = sc.nextLine();
        System.out.println(loginUser(user, pass));
    }
}

public class Assignment1Q6 {
    public static void main(String[] args) {
        Login ob = new Login();
        ob.getInput();

    }
}
