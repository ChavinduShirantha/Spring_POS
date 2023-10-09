package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : Chavindu
 * created : 10/9/2023-3:43 PM
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrdersDTO {
    private String oid;
    private LocalDate date;
    private String cusID;
    private List<OrderDetailsDTO> orderDetails;
}
