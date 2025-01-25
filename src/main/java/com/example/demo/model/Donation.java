package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "donations")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donationId;

    @Column(length = 100)
    private String donorName;

    @Column(length = 100)
    private String email;

    @Column(length = 15)
    private String phoneNumber;

    @Column(nullable = false)
    private Double amount;

    @Column(length = 50)
    private String paymentMethod;

    @Column(nullable = false)
    private LocalDateTime donationDate = LocalDateTime.now();

    @Column(length = 100)
    private String purpose;

	public Long getDonationId() {
		return donationId;
	}

	public void setDonationId(Long donationId) {
		this.donationId = donationId;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public LocalDateTime getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(LocalDateTime donationDate) {
		this.donationDate = donationDate;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

    
}
