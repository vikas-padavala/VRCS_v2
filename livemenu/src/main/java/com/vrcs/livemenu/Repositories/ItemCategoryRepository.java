package com.vrcs.livemenu.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrcs.livemenu.Entities.ItemCategory;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {

}
