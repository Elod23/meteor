package com.example.entities.products;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Categories {

		@Id
		private Integer CategoryID;
		@NotNull
		private String Name;
		
		private String Description;

		public Integer getCategoryID() {
			return CategoryID;
		}

		public void setCategoryID(Integer categoryID) {
			this.CategoryID = categoryID;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			this.Name = name;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			this.Description = description;
		}
		
		
}
