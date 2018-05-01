package net.cnr.InventoryBackEnd.dao;

import java.util.List;

import net.cnr.InventoryBackEnd.dto.Item;

public interface ItemDao {

	Item get(int itemId);
	List<Item> list();
	boolean add(Item item);
	boolean update(Item item);
	boolean delete(Item item);
	
}
