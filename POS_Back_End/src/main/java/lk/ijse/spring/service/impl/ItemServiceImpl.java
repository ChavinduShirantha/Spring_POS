package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author : Chavindu
 * created : 10/9/2023-7:44 PM
 **/

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepo itemRepo;

    @Autowired
    ModelMapper mapper;
    @Override
    public void saveItem(ItemDTO dto) {
        if (itemRepo.existsById(dto.getCode())) {
            throw new RuntimeException(dto.getCode()+" is already available, please insert a new ID");
        }

        Item map = mapper.map(dto, Item.class);

        itemRepo.save(map);
    }
}
