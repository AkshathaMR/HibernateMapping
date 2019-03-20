package com.akshatha.relation.utility;

import java.util.Date;

import com.akshatha.relation.Entity.BatteryEntity;
import com.akshatha.relation.Entity.MobileEntity;
import com.akshatha.relation.repository.MobileRespository;

public class OneToOneTester {

	public static void main(String[] args) {
MobileEntity mobileEntity = new MobileEntity();
mobileEntity.setBrand("SAMSUNG");
mobileEntity.setPrice(21000);
mobileEntity.setDelivaryDate(new Date(18/03/2019));

BatteryEntity batteryEntity = new BatteryEntity();
batteryEntity.setCapacity("10Ah");
batteryEntity.setBackUp("3h");
mobileEntity.setBatteryEntity(batteryEntity);
batteryEntity.setMobileEntity(mobileEntity);
MobileRespository repository = new MobileRespository();
repository.save(mobileEntity);


	}

}
