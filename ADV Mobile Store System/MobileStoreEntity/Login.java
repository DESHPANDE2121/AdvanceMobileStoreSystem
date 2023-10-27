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
@Table(name="Login_info")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Login {
	@Id   // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int login_id;
	private String loginusername;
	private String loginroleid;
	private String loginpassword;
	private String loginaddress;
	private String logincountry;
	private String loginEmail;

}
