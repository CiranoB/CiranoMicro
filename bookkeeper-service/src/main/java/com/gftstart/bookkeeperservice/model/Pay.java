package com.gftstart.bookkeeperservice.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Pay {

		@Id
		@GeneratedValue(generator = "UUID")
		@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
		@Type(type = "org.hibernate.type.UUIDCharType")
		private UUID uuidPay;
	
		private Float valuePay;

		private String datePay;
	
		private String dueDatePay;
		
		private String uuidPersonPay;


//		public Pay(UUID uuidPay, Float valuePay, String datePay, String dueDatePay, String uuidPersonPay) {
//			this.uuidPay = uuidPay;
//			this.valuePay = valuePay;
//			this.datePay = datePay;
//			this.dueDatePay = dueDatePay;
//			this.uuidPersonPay = uuidPersonPay;
//		}
//		
//		
//		public Pay() {
//		}

		public UUID getUuidPay() {
			return uuidPay;
		}

		public void setUuidPay(UUID uuidPay) {
			this.uuidPay = uuidPay;
		}

		public Float getValuePay() {
			return valuePay;
		}

		public void setValuePay(Float valuePay) {
			this.valuePay = valuePay;
		}

		public String getDatePay() {
			return datePay;
		}

		public void setDatePay(String datePay) {
			this.datePay = datePay;
		}

		public String getDueDatePay() {
			return dueDatePay;
		}

		public void setDueDatePay(String dueDatePay) {
			this.dueDatePay = dueDatePay;
		}

		public String getUuidPersonPay() {
			return uuidPersonPay;
		}

		public void setUuidPersonPay(String uuidPersonPay) {
			this.uuidPersonPay = uuidPersonPay;
		}
		
		
		
}
