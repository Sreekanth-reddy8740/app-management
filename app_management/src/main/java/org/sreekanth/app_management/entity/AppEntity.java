package org.sreekanth.app_management.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="app_service_info")
public class AppEntity implements Serializable
{
	@Id
	@GenericGenerator(name="action",strategy = "increment")
	@GeneratedValue(generator = "action")
	@Column(name="alt_key")
	private long altkey;
	
	@Column(name="service_name")
	private String serviceName;
	
	@Column(name="url")
	private String url;
	
	@Column(name="status")
	private String status;
	
	@Column(name="created_date")
	private String createdDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_date")
	private String modifiedDate;
	
	@Column(name="modified_by")
	private String modifieBy;
	
	
	public long getAltkey() {
		return altkey;
	}
	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}


	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}


	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifieBy() {
		return modifieBy;
	}
	public void setModifieBy(String modifieBy) {
		this.modifieBy = modifieBy;
	}
	@Override
	public String toString() {
		return "AppEntity [altkey=" + altkey + ", serviceName=" + serviceName + ", url=" + url + ", status=" + status
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate
				+ ", modifieBy=" + modifieBy + "]";
	}
}
