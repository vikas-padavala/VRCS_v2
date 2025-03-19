package com.vrcs.livemenu.Mappers;

import com.vrcs.livemenu.DTOs.ItemCreationDto;
import com.vrcs.livemenu.DTOs.ItemResponseDto;
import com.vrcs.livemenu.Entities.Item;

public class ItemMapper {
    public static Item itemCreationDtoToItem(ItemCreationDto itemCreationDto) {
        Item item = Item.builder().price(itemCreationDto.getPrice()).name(itemCreationDto.getName())
                .updatedBy("LiveMenuRW").build();
        return item;
    }

    public static ItemResponseDto itemToItemResponseDto(Item item) {
        ItemResponseDto itemResponseDto = ItemResponseDto.builder().id(item.getId()).name(item.getName())
                .price(item.getPrice()).ItemCategoryResponseDto(
                        ItemCategoryMapper.itemCategoryToItemCategoryResponseDto(item.getItemCategory()))
                .build();
        return itemResponseDto;
    }
}
