package org.sreekanth.app_management.dto;

import java.io.Serializable;

public class AppDto implements Serializable{

	private long altkey;
	
	private String serviceName;
	
	//private String url;
	
	private String status;
	
	//private String createdDate;
	
	private String createdBy;
	
	//private String modifiedDate;
	
	private String modifieBy;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

//	public String getUrl() {
//		return url;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	public String getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(String createdDate) {
//		this.createdDate = createdDate;
//	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

//	public String getModifiedDate() {
//		return modifiedDate;
//	}
//
//	public void setModifiedDate(String modifiedDate) {
//		this.modifiedDate = modifiedDate;
//	}

	public String getModifieBy() {
		return modifieBy;
	}

	public void setModifieBy(String modifieBy) {
		this.modifieBy = modifieBy;
	}

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}
	
	
}
