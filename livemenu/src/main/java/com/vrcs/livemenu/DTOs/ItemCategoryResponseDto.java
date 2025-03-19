package com.vrcs.livemenu.DTOs;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemCategoryResponseDto {
    private Long id;

    private String name;

    private int priority;
}
