package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author : Chavindu
 * created : 10/9/2023-3:43 PM
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrderDetailsDTO {
    private String oid;
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;
}
