package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrderDetailsDTO;
import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.OrderDetailsRepo;
import lk.ijse.spring.repo.OrdersRepo;
import lk.ijse.spring.service.PurchaseOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author : Chavindu
 * created : 10/10/2023-5:39 PM
 **/
@Service
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Autowired
    OrdersRepo ordersRepo;

    @Autowired
    OrderDetailsRepo orderDetailsRepo;


    @Autowired
    ModelMapper mapper;
    @Override
    public void purchaseOrder(OrdersDTO dto, OrderDetailsDTO orderDetailsDTO) {
        if (ordersRepo.existsById(dto.getOid())) {
            throw new RuntimeException(dto.getOid()+ " Is already available.!");
        }

        Orders order = mapper.map(dto, Orders.class);
        ordersRepo.save(order);

        OrderDetails orderDetails = mapper.map(dto, OrderDetails.class);
        orderDetailsRepo.save(orderDetails);
    }
}
