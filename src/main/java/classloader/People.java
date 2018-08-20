package classloader;
/**
 * people类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-20 14:07
 */
public class People {
    private String name;

    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("hello xiongzp08");
    }
}
