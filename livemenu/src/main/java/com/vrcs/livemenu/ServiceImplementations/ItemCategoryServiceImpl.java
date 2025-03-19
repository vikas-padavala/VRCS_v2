package com.vrcs.livemenu.ServiceImplementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrcs.livemenu.DTOs.ItemCategoryCreationDto;
import com.vrcs.livemenu.DTOs.ItemCategoryResponseDto;
import com.vrcs.livemenu.Entities.ItemCategory;
import com.vrcs.livemenu.Exceptions.ItemCategoryNotFound;
import com.vrcs.livemenu.Repositories.ItemCategoryRepository;
import com.vrcs.livemenu.Services.ItemCategoryService;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Autowired
    private ItemCategoryRepository itemCategoryRepository;

    @Override
    public ItemCategoryResponseDto createItemCategory(ItemCategoryCreationDto itemCategoryDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createItemCategory'");
    }

    @Override
    public List<ItemCategoryResponseDto> getAllItemCategories() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllItemCategories'");
    }

    @Override
    public ItemCategory getItemCategoryById(Long id) {
        ItemCategory itemCategory = itemCategoryRepository.findById(id)
                .orElseThrow(() -> new ItemCategoryNotFound(String.format("Item Category with id %d not found", id)));
        return itemCategory;
    }

}
