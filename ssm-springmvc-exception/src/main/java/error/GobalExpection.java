package error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Classname GobalExpection
 * @Description TODO
 * @Date 2024/12/3 10:17
 * @Created by cxx
 */
//@ControllerAdvice//可以返回逻辑视图，转发和重定向
@RestControllerAdvice//直接返回json字符串，
//发生异常就会走此类的handler方法
public class GobalExpection {
    @ExceptionHandler(ArithmeticException.class)//处理算术方法异常
    public Object suanshuchuli(ArithmeticException e) {
        String message = e.getMessage();
        return message;
    }

    @ExceptionHandler(Exception.class)//捕获全部异常，如果此类中没有对应的异常处理方法就会走此异常
    public Object gobal(Exception e) {
        String message = e.getMessage();
        return message;
    }
}
