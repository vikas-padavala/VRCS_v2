package com.vrcs.livemenu.Mappers;

import com.vrcs.livemenu.DTOs.ItemCategoryResponseDto;
import com.vrcs.livemenu.Entities.ItemCategory;

public class ItemCategoryMapper {
    public static ItemCategoryResponseDto itemCategoryToItemCategoryResponseDto(ItemCategory itemCategory) {
        ItemCategoryResponseDto itemCategoryResponseDto = ItemCategoryResponseDto.builder().id(itemCategory.getId())
                .name(itemCategory.getName()).priority(itemCategory.getPriority()).build();
        return itemCategoryResponseDto;
    }
}
