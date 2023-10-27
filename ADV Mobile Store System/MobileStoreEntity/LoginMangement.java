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
@Table(name="LoginMangement_info")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginMangement {
	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Login_id;
	private String L_username;
	private String L_pass;
	private String L_Role;

}
