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
@Table(name="userLogin_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userlogin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uLogin_id;
	private String u_username;
	private String u_pass;
	

}
