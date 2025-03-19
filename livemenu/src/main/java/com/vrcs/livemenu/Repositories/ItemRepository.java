package com.vrcs.livemenu.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrcs.livemenu.Entities.Item;
import com.vrcs.livemenu.Entities.ItemCategory;

public interface ItemRepository extends JpaRepository<Item, Long> {

    public List<Item> findByItemCategory(ItemCategory itemCategory);
}
