package com.example.demo.entities.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Category {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="CategoryID")
		private Integer categoryId;
		@NotNull
		@Column(name="Name")
		private String name;
		
		@Column(name="Description")
		private String description;

		public Integer getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
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
