package com.vrcs.livemenu.ServiceImplementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vrcs.livemenu.DTOs.ItemCreationDto;
import com.vrcs.livemenu.DTOs.ItemResponseDto;
import com.vrcs.livemenu.Entities.Item;
import com.vrcs.livemenu.Entities.ItemCategory;
import com.vrcs.livemenu.Exceptions.ItemNotFound;
import com.vrcs.livemenu.Mappers.ItemMapper;
import com.vrcs.livemenu.Repositories.ItemRepository;
import com.vrcs.livemenu.Services.ItemCategoryService;
import com.vrcs.livemenu.Services.ItemService;

public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ItemCategoryService itemCategoryService;

    @Override
    public ItemResponseDto createItem(Long itemCategoryId, ItemCreationDto itemCreationDto) {
        ItemCategory itemCategory = itemCategoryService.getItemCategoryById(itemCategoryId);
        Item item = ItemMapper.itemCreationDtoToItem(itemCreationDto);
        item.setItemCategory(itemCategory);
        item = itemRepository.save(item);
        ItemResponseDto savedItemDto = ItemMapper.itemToItemResponseDto(item);
        return savedItemDto;
    }

    @Override
    public List<ItemResponseDto> getAllItems() {
        List<Item> items = itemRepository.findAll();
        List<ItemResponseDto> itemDtos = new ArrayList<ItemResponseDto>(items.size());
        for (Item item : items) {
            itemDtos.add(ItemMapper.itemToItemResponseDto(item));
        }
        return itemDtos;
    }

    @Override
    public List<ItemResponseDto> getAllItemsByCategoryId(Long itemCategoryId) {
        ItemCategory itemCategory = itemCategoryService.getItemCategoryById(itemCategoryId);
        List<Item> items = itemRepository.findByItemCategory(itemCategory);
        List<ItemResponseDto> itemDtos = new ArrayList<ItemResponseDto>(items.size());
        for (Item item : items) {
            itemDtos.add(ItemMapper.itemToItemResponseDto(item));
        }
        return itemDtos;
    }

    @Override
    public void deleteItemById(Long itemId) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ItemNotFound(String.format("Item with Id %d not found", itemId)));
        itemRepository.delete(item);
    }

    @Override
    public ItemResponseDto getItemById(long itemId) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ItemNotFound(String.format("Item Category with id %d not found", itemId)));
        return ItemMapper.itemToItemResponseDto(item);
    }
}
