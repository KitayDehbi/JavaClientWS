import ws.User;
import ws.UserService;
import ws.UserWS;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        UserService proxy = new UserWS().getUserServicePort();
        System.out.println(proxy.getUser(2).getName());
        System.out.println(proxy.getBirthYear(21));
        List<User> list = proxy.getUserList();
        System.out.println("--------------");
        for (User u : list){
            System.out.println(u.getName());
            System.out.println(u.getAge());
        }

    }
}
