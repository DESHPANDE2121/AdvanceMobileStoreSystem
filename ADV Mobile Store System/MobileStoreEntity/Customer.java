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
@Table(name="Customer_info")
@Data
@AllArgsConstructor
@NoArgsConstructor



public class Customer {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Cus_id;
	private String Cus_Pass;
	private String Cus_Name;
	private String Cus_Email;
	private String Cus_address;
	private String Cus_RequiredMobile;

}
