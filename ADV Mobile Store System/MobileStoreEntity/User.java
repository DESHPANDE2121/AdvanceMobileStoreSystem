package com.example.MobileStoreEntity;

import com.example.roombooking.entity.Payment;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
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
@Table(name="User_info")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int u_id;
	private String u_firstname;
	private String u_address;
	private String u_mobilenumber;
	@OneToMany(cascade=CascadeType.ALL)
	@JsonManagedReference
	private Payment payment;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JsonManagedReference
	private MobileModel mobilemodel;
	
	public void setPayment(int pay_id) {
		// TODO Auto-generated method stub
		
	}

	public void setMobilemodel(int m_model) {
		// TODO Auto-generated method stub
		
	}

	
	

}
