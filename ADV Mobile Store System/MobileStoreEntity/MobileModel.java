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
@Table(name="Mobilemodel_info")
@Data
@AllArgsConstructor
@NoArgsConstructor



public class MobileModel {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mob_name;
	private String mob_versionofSoftware;
	private String mob_Types;
	private String mob_model;
	private String mob_specfication;

}
