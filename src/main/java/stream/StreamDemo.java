package stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Stream示例
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-08-06-12:13
 */
public class StreamDemo {

    public static void main(String[] args) {

        jdk8();
    }

    private static void jdk7(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("语文");
        strings.add("数学");
        strings.add("英语");
        strings.add("历史");
        strings.add("政治");
        strings.add("地理");
        strings.add("化学");

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String s : strings) {
            System.out.println(s);
        }

    }

    /**
     * JDK8 新的表达方式
     */
    private static void jdk8(){
        ArrayList<String> list = new ArrayList<>();
        list.add("语文");
        list.add("数学");
        list.add("英语");
        list.add("历史");
        list.add("政治");
        list.add("地理");
        list.add("化学");
        list.add("化学2");
        list.add("化学3");

        list.parallelStream().filter(t -> t.length() == 3).sorted().collect(Collectors.toList()).forEach(System.out::println);

        list.forEach(e -> System.out.println(e));

    }
}
