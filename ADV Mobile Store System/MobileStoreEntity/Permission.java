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
@Table(name="permission_info")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Permission {
	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int per_id;
	private String per_add;
	private String per_module;
	private String per_roleid;

}
