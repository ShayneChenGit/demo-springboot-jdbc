package jdbc.service;

import jdbc.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void getList() {
        List<User> userList = userService.getList();
        System.out.println(userList);
    }
}