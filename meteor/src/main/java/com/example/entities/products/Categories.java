package com.example.entities.products;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Categories {

		@Id
		private Integer categoryID;
		@NotNull
		private String name;
		
		private String description;

		public Integer getCategoryID() {
			return categoryID;
		}

		public void setCategoryID(Integer categoryID) {
			this.categoryID = categoryID;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
		
}
