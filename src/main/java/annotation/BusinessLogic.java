package annotation;

/**
 * 业务逻辑类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-08-03-16:02
 */
public class BusinessLogic {
    public BusinessLogic() {
        super();
    }

    public void completeMethod(){
        System.out.println("This method is complete");
    }

    @Todo(priority = Todo.Priority.HIGH)
    public void notYetStartedMethod(){
        //no Code Written yet
    }

    @Todo(priority = Todo.Priority.MEDIUM, author = "xzp", status = Todo.Status.STARTED)
    public void incompleteMethod1() {
        //Some business logic is written
        //But its not complete yet
    }

    @Todo(priority = Todo.Priority.LOW, status = Todo.Status.STARTED )
    public void incompleteMethod2() {
        //Some business logic is written
        //But its not complete yet
    }
}
