package lk.ijse.spring.service;

import lk.ijse.spring.dto.OrderDetailsDTO;
import lk.ijse.spring.dto.OrdersDTO;

/**
 * @author : Chavindu
 * created : 10/10/2023-5:39 PM
 **/

public interface PurchaseOrderService {
    public void purchaseOrder(OrdersDTO dto, OrderDetailsDTO orderDetailsDTO);
}
