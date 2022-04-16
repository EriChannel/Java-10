import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

import java.util.Random;
import org.mindrot.jbcrypt.BCrypt;

public class Main {
    public static void main(String[] args) {

        Random rd = new Random();
        char []number = "1234567890".toCharArray();

        String id = "NV"+ NanoIdUtils.randomNanoId(rd, number, 5);
        System.out.println(id);

        String password = "123456789";

       String pass =  BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(pass);

        System.out.println( BCrypt.checkpw(password, pass));


    }
}
