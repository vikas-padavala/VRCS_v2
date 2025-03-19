package com.vrcs.livemenu.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrcs.livemenu.DTOs.ItemCategoryCreationDto;
import com.vrcs.livemenu.DTOs.ItemCategoryResponseDto;
import com.vrcs.livemenu.Services.ItemCategoryService;

@RestController
@RequestMapping("/api")
public class ItemCategoryController {
    @Autowired
    private ItemCategoryService itemCategoryService;

    @PostMapping("/itemCategory")
    public ResponseEntity<ItemCategoryResponseDto> createItemCategory(
            @RequestBody ItemCategoryCreationDto itemCategoryCreationDto) {
        return new ResponseEntity<ItemCategoryResponseDto>(itemCategoryService.createItemCategory(itemCategoryCreationDto),
                HttpStatus.CREATED);
    }

    @GetMapping("/itemCategory")
    public ResponseEntity<List<ItemCategoryResponseDto>> getAllItemCategories() {
        return new ResponseEntity<List<ItemCategoryResponseDto>>(itemCategoryService.getAllItemCategories(),
                HttpStatus.OK);
    }
}
