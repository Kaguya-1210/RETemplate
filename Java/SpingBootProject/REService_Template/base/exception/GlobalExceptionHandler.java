



import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailSendException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.ConnectException;

/**
 * ControllerAdvice注解: 标识当前的类为全局异常处理器类型;可以处理由控制器抛出的异常
 *   1.如果Controller中抛出了异常,首先看是否定义了全局异常处理器;
 *   2.如果定义了会在全局异常处理器中找对应的异常处理方法;
 *   3.如果找到了对应的异常处理方法,则执行异常处理方法中的代码逻辑.
 * RestControllerAdvice注解: 复合注解,相当于 @ResponseBody + @ControllerAdvise注解
 */
//@ControllerAdvice
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public JsonResult doHandlerMessagingException(MailSendException mailSendException) {
        String msg = mailSendException.getMessage();
        log.error("emailServiceError:" + msg);
        return new JsonResult(StatusCode.EMAIL_SERVICE_ERROR, msg);
    }
}