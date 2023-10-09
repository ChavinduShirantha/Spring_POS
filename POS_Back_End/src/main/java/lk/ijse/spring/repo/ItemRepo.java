package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Chavindu
 * created : 10/9/2023-7:46 PM
 **/

public interface ItemRepo extends JpaRepository<Item,String> {
}
