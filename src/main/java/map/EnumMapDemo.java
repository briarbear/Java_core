package map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        //注意使用方法
        EnumMap<Course,String> map = new EnumMap<Course, String>(Course.class);
        map.put(Course.ONE,"语文");
        map.put(Course.THREE,"英语");
        map.put(Course.TWO,"数学");
        map.put(Course.ONE,"政治");
        for (Map.Entry<Course, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

//枚举类
enum Course{
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE;
}