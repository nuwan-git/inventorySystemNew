package net.cnr.InventoryBackEnd.dto;

public class Item {

		
		private int id;
		private String itemName;
		private String itemCategory;
		private String itemDescription;
		private Double itemPrice;
		private Double quantity;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getItemCategory() {
			return itemCategory;
		}
		public void setItemCategory(String itemCategory) {
			this.itemCategory = itemCategory;
		}
		public String getItemDescription() {
			return itemDescription;
		}
		public void setItemDescription(String itemDescription) {
			this.itemDescription = itemDescription;
		}
		public Double getItemPrice() {
			return itemPrice;
		}
		public void setItemPrice(Double itemPrice) {
			this.itemPrice = itemPrice;
		}
		public Double getQuantity() {
			return quantity;
		}
		public void setQuantity(Double quantity) {
			this.quantity = quantity;
		}
		@Override
		public String toString() {
			return "Item [id=" + id + ", itemName=" + itemName + ", itemCategory=" + itemCategory + ", itemDescription="
					+ itemDescription + ", itemPrice=" + itemPrice + ", quantity=" + quantity + "]";
		}
		
		
}
