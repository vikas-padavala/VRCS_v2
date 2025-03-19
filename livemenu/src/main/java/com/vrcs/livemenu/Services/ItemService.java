package com.vrcs.livemenu.Services;

import java.util.List;

import com.vrcs.livemenu.DTOs.ItemCreationDto;
import com.vrcs.livemenu.DTOs.ItemResponseDto;

public interface ItemService {

    public ItemResponseDto createItem(Long itemCategoryId, ItemCreationDto itemCreationDto);

    public List<ItemResponseDto> getAllItems();

    public List<ItemResponseDto> getAllItemsByCategoryId(Long itemCategoryId);

    public void deleteItemById(Long itemId);

    public ItemResponseDto getItemById(long itemId);
}
