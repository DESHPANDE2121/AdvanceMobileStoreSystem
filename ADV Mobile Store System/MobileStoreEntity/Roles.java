package com.example.MobileStoreEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Roles_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int r_id;
	private String r_Name;
	private String r_RequiredRole;
	
	

}
