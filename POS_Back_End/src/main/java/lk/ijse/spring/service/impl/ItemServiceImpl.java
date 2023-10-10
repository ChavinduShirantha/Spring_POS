package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    @Override
    public void deleteItem(String id) {
        if (!itemRepo.existsById(id)) {
            throw new RuntimeException(id+ " Item is not available, please check the ID before delete.!");
        }
        itemRepo.deleteById(id);
    }

    @Override
    public List<ItemDTO> getAllItem() {
        List<Item> all = itemRepo.findAll();
        return mapper.map(all, new TypeToken<List<ItemDTO>>() {}.getType());
    }

    @Override
    public ItemDTO findItem(String id) {
        if (!itemRepo.existsById(id)) {
            throw new RuntimeException(id+ " Item is not available, please check the ID.!");
        }
        Item item = itemRepo.findById(id).get();
        return mapper.map(item,ItemDTO.class);
    }

    @Override
    public void updateItem(ItemDTO c) {
        if (!itemRepo.existsById(c.getCode())) {
            throw new RuntimeException(c.getCode()+ " Item is not available, please check the ID before update.!");
        }
        Item map = mapper.map(c, Item.class);
        itemRepo.save(map);
    }
}
