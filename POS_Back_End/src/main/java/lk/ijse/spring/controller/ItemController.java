package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Chavindu
 * created : 10/9/2023-7:44 PM
 **/

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {
    @Autowired
    ItemService service;

    @PostMapping
    public ResponseUtil saveItem(ItemDTO dto){
        service.saveItem(dto);
        return new ResponseUtil("Ok","Successfully Added",dto);
    }

    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteItem(String id){
        service.deleteItem(id);
        return new ResponseUtil("Ok","Successfully Deleted",id);
    }

    @GetMapping
    public ResponseUtil getAllItem(){
        return new ResponseUtil("Ok","Successfully Loaded",service.getAllItem());
    }

    @GetMapping(params = {"id"})
    public ResponseUtil findItem(String id){
        return new ResponseUtil("Ok","Successfully Loaded", service.findItem(id));
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO c){
        service.updateItem(c);
        return new ResponseUtil("Ok","Successfully Updated",c);
    }
}
