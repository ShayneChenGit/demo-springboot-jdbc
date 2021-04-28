package jdbc.pojo;

import lombok.Data;
import java.io.Serializable;

@Data
public class User implements Serializable {
    private String username;
    private String password;
    private int gender;
    private String email;
}
