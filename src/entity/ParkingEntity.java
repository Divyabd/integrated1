package entity;

public class ParkingEntity {
private int slot;
private String vehNumber;
private String time;
private int day;

ParkingEntity(){}

public ParkingEntity(int slot, String vehNumber, String time,int day){
	this.slot = slot;
	this.vehNumber = vehNumber;
	this.time = time;
	this.day=day;
}


public int getSlot() {
	return slot;
}


public void setSlot(int slot) {
	this.slot = slot;
}


public String getVehNumber() {
	return vehNumber;
}
public void setVehNumber(String vehNumber) {
	this.vehNumber = vehNumber;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

}
