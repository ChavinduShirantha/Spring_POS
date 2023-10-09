package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.List;

/**
 * @author : Chavindu
 * created : 10/9/2023-4:55 PM
 **/

public interface CustomerService {
    void addCustomer(CustomerDTO dto);

    void deleteCustomer(String id);

    List<CustomerDTO> getAllCustomer();

    CustomerDTO findCustomer(String id);

    void updateCustomer(CustomerDTO c);
}
