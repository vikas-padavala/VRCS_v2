package com.vrcs.livemenu.Services;

import java.util.List;

import com.vrcs.livemenu.DTOs.ItemCategoryCreationDto;
import com.vrcs.livemenu.DTOs.ItemCategoryResponseDto;
import com.vrcs.livemenu.Entities.ItemCategory;

public interface ItemCategoryService {

    public ItemCategory getItemCategoryById(Long id);
    
    public ItemCategoryResponseDto createItemCategory(ItemCategoryCreationDto itemCategoryDto);

    public List<ItemCategoryResponseDto> getAllItemCategories();
}
