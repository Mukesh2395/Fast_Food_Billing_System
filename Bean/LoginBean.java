
package Bean;

/**
 *
 * @author user
 */
public class LoginBean {

    public static String getName() {
        return name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setName(String name) {
        LoginBean.name = name;
    }

    public static void setPassword(String password) {
        LoginBean.password = password;
    }

    public static String name,password;
}
