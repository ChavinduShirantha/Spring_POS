package lk.ijse.spring.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Chavindu
 * created : 10/9/2023-5:00 PM
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseUtil {
    private String state;
    private String message;
    private Object data;
}
