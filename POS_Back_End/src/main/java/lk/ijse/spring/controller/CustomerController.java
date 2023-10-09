package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chavindu
 * created : 10/9/2023-5:03 PM
 **/

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService service;

    @PostMapping
    public ResponseUtil addCustomer(CustomerDTO dto){
        service.addCustomer(dto);
        return new ResponseUtil("Ok","Successfully Added",dto);
    }

    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteCustomer(String id){
        service.deleteCustomer(id);
        return new ResponseUtil("Ok","Successfully Deleted",id);
    }

    @GetMapping
    public ResponseUtil getAllCustomer(){
        return new ResponseUtil("Ok","Successfully Loaded",service.getAllCustomer());
    }

    @GetMapping(params = {"id"})
    public ResponseUtil findCustomer(String id){
        return new ResponseUtil("Ok","Successfully Loaded", service.findCustomer(id));
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO c){
        service.updateCustomer(c);
        return new ResponseUtil("Ok","Successfully Updated",c);
    }
}
