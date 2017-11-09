package com.mianshi.entity;

import java.util.Date;

public class Distination {
	private Long id;//id
	private String name;//名称
	private String parentName;//地点类型
	private Byte shelveFlag;//上下架状�?
	private String imgUrl;//图片路径
	private String createUserId;//创建人id 
	private Date createDate;//创建时间
	private Date lastUpdateDate;//上次修改时间
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public Byte getShelveFlag() {
		return shelveFlag;
	}
	public void setShelveFlag(Byte shelveFlag) {
		this.shelveFlag = shelveFlag;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	
	
	
	
}
