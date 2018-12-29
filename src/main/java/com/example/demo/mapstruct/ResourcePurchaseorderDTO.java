package com.example.demo.mapstruct;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 
 * @date 2018-10-29
 */
public class ResourcePurchaseorderDTO {

    /**
     * 采购单ID
     */
	private Long purchaseOrderId;

    /**
     * 订单号
     */
	private Long orderId;

    /**
     * 来源订单ID（0为没有来源订单）
     */
	private Long sourceOrderId;

    /**
     * 来源订单类型（销售子订单S，其它）
     */
	private String sourceOrderType;

    /**
     * 状态(P-审核通过；C-取消；V-生效；I-作废)
     */
	private String status;

    /**
     * 成本
     */
	private BigDecimal cost;

    /**
     * 份数
     */
	private Integer quantity;

    /**
     * 资源编号
     */
	private Long resourceId;

    /**
     * 资源类型
     */
	private String resourceType;

    /**
     * 资源名称
     */
	private String resourceName;

    /**
     * 资源描述
     */
	private String resourceDesc;

    /**
     * 行程段编号
     */
	private Integer segment;

    /**
     * 成人数量
     */
	private Integer adultQuantity;

    /**
     * 儿童份数
     */
	private Integer childQuantity;

    /**
     * 成人底价
     */
	private BigDecimal adultCost;

    /**
     * 儿童底价
     */
	private BigDecimal childCost;

    /**
     * 操作员
     */
	private String eid;

    /**
     * 操作描述
     */
	private String remark;

    /**
     * 使用日期
     */
	private Timestamp useDate;

    /**
     * 币种
     */
	private String currency;

    /**
     * 汇率
     */
	private BigDecimal exchange;

    /**
     * 供应商ID
     */
	private Long providerId;

    /**
     * 创建时间
     */
	private Timestamp datacreateLasttime;

    /**
     * 最后一次修改时间
     */
	private Timestamp datachangeLasttime;

	public Long getPurchaseOrderId() {
		return purchaseOrderId;
	}

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getSourceOrderId() {
		return sourceOrderId;
	}

	public void setSourceOrderId(Long sourceOrderId) {
		this.sourceOrderId = sourceOrderId;
	}

	public String getSourceOrderType() {
		return sourceOrderType;
	}

	public void setSourceOrderType(String sourceOrderType) {
		this.sourceOrderType = sourceOrderType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceDesc() {
		return resourceDesc;
	}

	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}

	public Integer getSegment() {
		return segment;
	}

	public void setSegment(Integer segment) {
		this.segment = segment;
	}

	public Integer getAdultQuantity() {
		return adultQuantity;
	}

	public void setAdultQuantity(Integer adultQuantity) {
		this.adultQuantity = adultQuantity;
	}

	public Integer getChildQuantity() {
		return childQuantity;
	}

	public void setChildQuantity(Integer childQuantity) {
		this.childQuantity = childQuantity;
	}

	public BigDecimal getAdultCost() {
		return adultCost;
	}

	public void setAdultCost(BigDecimal adultCost) {
		this.adultCost = adultCost;
	}

	public BigDecimal getChildCost() {
		return childCost;
	}

	public void setChildCost(BigDecimal childCost) {
		this.childCost = childCost;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getUseDate() {
		return useDate;
	}

	public void setUseDate(Timestamp useDate) {
		this.useDate = useDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getExchange() {
		return exchange;
	}

	public void setExchange(BigDecimal exchange) {
		this.exchange = exchange;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}

	public Timestamp getDatacreateLasttime() {
		return datacreateLasttime;
	}

	public void setDatacreateLasttime(Timestamp datacreateLasttime) {
		this.datacreateLasttime = datacreateLasttime;
	}

	public Timestamp getDatachangeLasttime() {
		return datachangeLasttime;
	}

	public void setDatachangeLasttime(Timestamp datachangeLasttime) {
		this.datachangeLasttime = datachangeLasttime;
	}

}