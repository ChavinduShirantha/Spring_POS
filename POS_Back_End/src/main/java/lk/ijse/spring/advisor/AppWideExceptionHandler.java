package lk.ijse.spring.advisor;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : Chavindu
 * created : 10/9/2023-4:59 PM
 **/

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseUtil handleAllRuntimeExceptions(RuntimeException e){
        return new ResponseUtil("Error",e.getMessage(),null);
    }
}
