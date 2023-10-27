package com.example.MobileStoreEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="payment_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paymentmethod {

	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pay_id;
	private String pay_method;
	private String pay_name;
	private int pay_amount;
	private String pay_address;
	private String pay_MobileNumber;
	private String pay_MobileIMEI;
	private String pay_purchaseDate;
	private String pay_MobileModel;
	@OneToMany(mappedBy="payment")
	
	private User user;
	public void setUser(String u_firstname) {
		// TODO Auto-generated method stub
		
	}
	public void setUser(int u_id) {
		// TODO Auto-generated method stub
		
	}
		
}
