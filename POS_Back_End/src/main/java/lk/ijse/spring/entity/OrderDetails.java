package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author : Chavindu
 * created : 10/9/2023-3:41 PM
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@IdClass(OrderItem_PK.class)
public class OrderDetails {
    @Id
    private String oid;
    @Id
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;

    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "itemCode",referencedColumnName = "code",insertable = false,updatable = false)
    private Item items;

}
