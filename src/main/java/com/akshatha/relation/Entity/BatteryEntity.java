package com.akshatha.relation.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="battery_table")
public class BatteryEntity implements Serializable{
	@Id
	@GenericGenerator(name="qq",strategy="increment")
	@GeneratedValue(generator="qq")
	@Column(name="b_id")
private int id;
	@Column(name="b_capacity")
private String capacity;
	@Column(name="b_backUp")
private String backUp;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
private MobileEntity mobileEntity;
public BatteryEntity() {
	System.out.println("created :\t" +this.getClass().getSimpleName());
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity = capacity;
}
public String getBackUp() {
	return backUp;
}
public void setBackUp(String backUp) {
	this.backUp = backUp;
}
public MobileEntity getMobileEntity() {
	return mobileEntity;
}
public void setMobileEntity(MobileEntity mobileEntity) {
	this.mobileEntity = mobileEntity;
}

}
