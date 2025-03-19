package com.vrcs.livemenu.DTOs;

import com.vrcs.livemenu.Entities.ItemCategory;

import lombok.Data;

@Data
public class ItemCreationDto {

    private String name;

    private int price;

    private ItemCategory itemCategory;
}
