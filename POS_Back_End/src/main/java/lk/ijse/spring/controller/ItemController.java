package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
