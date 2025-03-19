package com.vrcs.livemenu.DTOs;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ItemResponseDto {

    private Long id;

    private String name;

    private int price;

    private ItemCategoryResponseDto ItemCategoryResponseDto;
}
