package annotation;

import java.lang.reflect.Method;

/**
 * 注解测试类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-08-03-16:07
 */
public class TodoReport {
    public TodoReport() {
        super();
    }

    public static void main(String[] args) {
        getTodoReportForBusinessLogic();
    }


    private static void getTodoReportForBusinessLogic(){
        Class bussinessLogicClass = BusinessLogic.class;
        for (Method method : bussinessLogicClass.getMethods()) {
            //注解作为类似属性的方式附加到方法中
            Todo todoAnnotation = (Todo)method.getAnnotation(Todo.class);
            if (todoAnnotation != null){
                System.out.println("xzp");
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" Author : " + todoAnnotation.author());
                System.out.println(" Priority : " + todoAnnotation.priority());
                System.out.println(" Status : " + todoAnnotation.status());
                System.out.println(" --------------------------- ");
            }
        }

    }
}
