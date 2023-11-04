import POJO.UserForm;

public interface UserService {
    boolean login(UserForm user);
    boolean register(UserForm user);
}
