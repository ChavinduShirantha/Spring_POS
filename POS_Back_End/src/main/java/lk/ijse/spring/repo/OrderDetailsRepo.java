package lk.ijse.spring.repo;

import lk.ijse.spring.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Chavindu
 * created : 10/10/2023-5:40 PM
 **/

public interface OrderDetailsRepo extends JpaRepository<OrderDetails,String> {
}
