package com.example.bean;

public class MaerskBean {
	
	private String id;
	private CONTAINERENUM containerType;
	private int containerSize;
	private String origin;
	private String destination;
	private int quantity;
	private String timeStamp;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the timeStamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}
	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	/**
	 * @return the containerType
	 */
	public CONTAINERENUM getContainerType() {
		return containerType;
	}
	/**
	 * @param containerType the containerType to set
	 */
	public void setContainerType(CONTAINERENUM containerType) {
		this.containerType = containerType;
	}
	/**
	 * @return the containerSize
	 */
	public int getContainerSize() {
		return containerSize;
	}
	/**
	 * @param containerSize the containerSize to set
	 */
	public void setContainerSize(int containerSize) {
		this.containerSize = containerSize;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
