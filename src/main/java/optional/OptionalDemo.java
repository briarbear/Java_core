package optional;

import model.User;

import java.util.Optional;

/**
 * jdk8 Optional的使用
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-08-06-15:02
 */
public class OptionalDemo {

    public static void main(String[] args) {
        User user = new User();

        System.out.println(Optional.ofNullable(user).map(u -> u.getName()).orElse("xzp"));
    }
}
