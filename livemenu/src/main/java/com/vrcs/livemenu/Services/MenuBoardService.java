package com.vrcs.livemenu.Services;

import java.util.Set;

import com.vrcs.livemenu.DTOs.ItemListDto;
import com.vrcs.livemenu.Entities.MenuItem;

public interface MenuBoardService {

    public void addMenuItem(Long itemId);

    public Set<MenuItem> getMenu();

    public void addItemList(ItemListDto itemListDto);

    public void updateItemStatus(Long itemId, Integer status);

    // public void addMenuItemList(List<MenuItem> menuItems);

    // public void removeMenuItem(Long menuItemId);
}
