package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : Chavindu
 * created : 10/9/2023-3:42 PM
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItem_PK implements Serializable {
    private String oid;
    private String itemCode;
}
