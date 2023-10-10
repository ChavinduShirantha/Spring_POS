package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OrderDetailsDTO;
import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.service.PurchaseOrderService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chavindu
 * created : 10/10/2023-5:42 PM
 **/

@RestController
@RequestMapping("/purchase_order")
@CrossOrigin
public class PurchaseOrderController {
    @Autowired
    PurchaseOrderService service;

    @PostMapping
    public ResponseUtil purchaseOrder(OrdersDTO od,OrderDetailsDTO orderDetailsDTO) {
        service.purchaseOrder(od,orderDetailsDTO);
        return new ResponseUtil("Ok", "Successfully Purchased", od);
    }
}
