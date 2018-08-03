package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Todo注解
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-08-03-15:45
 */
@Target(ElementType.METHOD)  //表明该注解用于什么地方
@Retention(RetentionPolicy.RUNTIME) //表明该注解的生命周期
public @interface Todo {
    public enum Priority{LOW,MEDIUM,HIGH}
    public enum Status {STARTED, NOT_STARTED}
    String author() default "briarbear";
    Priority priority() default Priority.LOW;
    Status status() default Status.NOT_STARTED;

}
