package com.myweather.app.model;
//封装County信息
//Entity实体
public class County {
	
	private int id;
	private int CityId;
	private String CountyName;
	private String CountyCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCityId() {
		return CityId;
	}
	public void setCityId(int cityId) {
		CityId = cityId;
	}
	public String getCountyName() {
		return CountyName;
	}
	public void setCountyName(String countyName) {
		CountyName = countyName;
	}
	public String getCountyCode() {
		return CountyCode;
	}
	public void setCountyCode(String countyCode) {
		CountyCode = countyCode;
	}
	
	
	

}
