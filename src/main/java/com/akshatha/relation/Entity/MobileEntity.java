package com.akshatha.relation.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="mobile_table")
public class MobileEntity implements Serializable {
	@Id
	@GenericGenerator(name="qqq",strategy="increment")
	@GeneratedValue(generator="qqq")
	@Column(name="m_id")
private int id;
	@Column(name="m_brand")
private String brand;
	@Column(name="m_price")
private double price;
	@Column(name="m_delivaryDate")
private Date delivaryDate;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
private BatteryEntity batteryEntity;
public MobileEntity() {
	System.out.println("created : \t" +this.getClass().getSimpleName());
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Date getDelivaryDate() {
	return delivaryDate;
}

public void setDelivaryDate(Date delivaryDate) {
	this.delivaryDate = delivaryDate;
}

public BatteryEntity getBatteryEntity() {
	return batteryEntity;
}

public void setBatteryEntity(BatteryEntity batteryEntity) {
	this.batteryEntity = batteryEntity;
}


}
