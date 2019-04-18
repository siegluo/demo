package com.example.demo.mapstruct;

import java.math.BigDecimal;
import java.sql.Timestamp;



public class PurchasePurchaseOrder {

    //采购子订单ID
	
	
	
	private Integer purchaseOrderID;

    //来源订单ID（0为没有来源订单）
	
	
	private Long sourceOrderID;

    //来源订单类型（销售子订单S，其它）
	
	
	private String sourceOrderType;

    //订单ID
	
	
	private Long orderID;

    //行程段编号
	
	
	private Integer segment;

    //资源编号
	
	
	private Integer resourceID;

    //资源类型（非航班单选项I、可选项O、航班单选项无子订单F、航班单选项有子订单f、系统航班无子订单S、系统航班有子订单s）
	
	
	private String resourceType;

    //资源名称
	
	
	private String resourceName;

    //资源描述
	
	
	private String resourceDesc;

    //付款代码
	
	
	private String paymentCode;

    //成本;成人底价
	
	
	private BigDecimal cost;

    //份数;成人份数
	
	
	private Integer quantity;

    //状态(P-审核通过；C-取消；V-生效；I-作废)
	
	
	private String status;

    //操作员
	
	
	private String operator;

    //操作时间
	
	
	private Timestamp operateTime;

    //操作原因
	
	
	private String operateReason;

    //阶梯价格ID
	
	
	private Integer pkgStepCostsID;

    //儿童份数
	
	
	private Integer childQuantity;

    //婴儿份数
	
	
	private Integer babyQuantity;

    //儿童底价
	
	
	private BigDecimal childCost;

    //婴儿底价
	
	
	private BigDecimal babyCost;

    //提交状态，控制采购单是否需要供应商确认处理(提交：S，取消提交：C，默认—未提交/不需提交：N)
	
	
	private String vbSubmitStatus;

    //供应商确认状态(接受：A，拒绝：R，默认--未处理：N)
	
	
	private String vbApproveStatus;

    //出发城市名称
	
	
	private String startCityName;

    //订单联系人
	
	
	private String contactName;

    //预订日期
	
	
	private Timestamp orderDate;

    //使用日期
	
	
	private Timestamp useDate;

    //抵达日期
	
	
	private Timestamp arrivalDate;

    //离开日期
	
	
	private Timestamp departureDate;

    //OP提交预订时的备注信息
	
	
	private String vbRemark;

    //供应商处理采购单时的备注信息
	
	
	private String confirmRemark;

    //成人数量
	
	
	private Integer adultQuantity;

    //成人底价
	
	
	private BigDecimal adultCost;

    //供应商ID
	
	
	private Integer providerID;

    //采购单结算币种
	
	
	private String currency;

    //汇率
	
	
	private BigDecimal exchange;

    //预订单号
	
	
	private String onlinePKID;

    //核对时间
	
	
	private Timestamp collateDate;

    //vbk核对状态
	
	
	private String vbCollateStatus;

    //原始底价
	
	
	private BigDecimal sourceCost;

    //VBK修改单的原采购单id
	
	
	private Integer sourcePurchaseOrderID;

    //修改时间
	
	
	private Timestamp datachangeLasttime;

    //提交VBK取消时间点
	
	
	private Timestamp vBKCancelRequestTime;

    //佣金
	
	
	private BigDecimal commissionValue;

    //佣金比例
	
	
	private BigDecimal commissionLimit;

    //VBK提交时间
	
	
	private Timestamp vBKSubmitRequestTime;

    //子订单ID
	
	
	private Long subOrderId;

    //原始成人底价
	
	
	private BigDecimal originalAdultCost;

    //原始儿童底价
	
	
	private BigDecimal originalChildCost;

    //原始婴儿底价
	
	
	private BigDecimal originalBabyCost;

    //原始总底价
	
	
	private BigDecimal originalCost;

	public Integer getPurchaseOrderID() {
		return purchaseOrderID;
	}

	public void setPurchaseOrderID(Integer purchaseOrderID) {
		this.purchaseOrderID = purchaseOrderID;
	}

	public Long getSourceOrderID() {
		return sourceOrderID;
	}

	public void setSourceOrderID(Long sourceOrderID) {
		this.sourceOrderID = sourceOrderID;
	}

	public String getSourceOrderType() {
		return sourceOrderType;
	}

	public void setSourceOrderType(String sourceOrderType) {
		this.sourceOrderType = sourceOrderType;
	}

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public Integer getSegment() {
		return segment;
	}

	public void setSegment(Integer segment) {
		this.segment = segment;
	}

	public Integer getResourceID() {
		return resourceID;
	}

	public void setResourceID(Integer resourceID) {
		this.resourceID = resourceID;
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

	public String getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Timestamp getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Timestamp operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperateReason() {
		return operateReason;
	}

	public void setOperateReason(String operateReason) {
		this.operateReason = operateReason;
	}

	public Integer getPkgStepCostsID() {
		return pkgStepCostsID;
	}

	public void setPkgStepCostsID(Integer pkgStepCostsID) {
		this.pkgStepCostsID = pkgStepCostsID;
	}

	public Integer getChildQuantity() {
		return childQuantity;
	}

	public void setChildQuantity(Integer childQuantity) {
		this.childQuantity = childQuantity;
	}

	public Integer getBabyQuantity() {
		return babyQuantity;
	}

	public void setBabyQuantity(Integer babyQuantity) {
		this.babyQuantity = babyQuantity;
	}

	public BigDecimal getChildCost() {
		return childCost;
	}

	public void setChildCost(BigDecimal childCost) {
		this.childCost = childCost;
	}

	public BigDecimal getBabyCost() {
		return babyCost;
	}

	public void setBabyCost(BigDecimal babyCost) {
		this.babyCost = babyCost;
	}

	public String getVbSubmitStatus() {
		return vbSubmitStatus;
	}

	public void setVbSubmitStatus(String vbSubmitStatus) {
		this.vbSubmitStatus = vbSubmitStatus;
	}

	public String getVbApproveStatus() {
		return vbApproveStatus;
	}

	public void setVbApproveStatus(String vbApproveStatus) {
		this.vbApproveStatus = vbApproveStatus;
	}

	public String getStartCityName() {
		return startCityName;
	}

	public void setStartCityName(String startCityName) {
		this.startCityName = startCityName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Timestamp getUseDate() {
		return useDate;
	}

	public void setUseDate(Timestamp useDate) {
		this.useDate = useDate;
	}

	public Timestamp getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Timestamp arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Timestamp getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Timestamp departureDate) {
		this.departureDate = departureDate;
	}

	public String getVbRemark() {
		return vbRemark;
	}

	public void setVbRemark(String vbRemark) {
		this.vbRemark = vbRemark;
	}

	public String getConfirmRemark() {
		return confirmRemark;
	}

	public void setConfirmRemark(String confirmRemark) {
		this.confirmRemark = confirmRemark;
	}

	public Integer getAdultQuantity() {
		return adultQuantity;
	}

	public void setAdultQuantity(Integer adultQuantity) {
		this.adultQuantity = adultQuantity;
	}

	public BigDecimal getAdultCost() {
		return adultCost;
	}

	public void setAdultCost(BigDecimal adultCost) {
		this.adultCost = adultCost;
	}

	public Integer getProviderID() {
		return providerID;
	}

	public void setProviderID(Integer providerID) {
		this.providerID = providerID;
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

	public String getOnlinePKID() {
		return onlinePKID;
	}

	public void setOnlinePKID(String onlinePKID) {
		this.onlinePKID = onlinePKID;
	}

	public Timestamp getCollateDate() {
		return collateDate;
	}

	public void setCollateDate(Timestamp collateDate) {
		this.collateDate = collateDate;
	}

	public String getVbCollateStatus() {
		return vbCollateStatus;
	}

	public void setVbCollateStatus(String vbCollateStatus) {
		this.vbCollateStatus = vbCollateStatus;
	}

	public BigDecimal getSourceCost() {
		return sourceCost;
	}

	public void setSourceCost(BigDecimal sourceCost) {
		this.sourceCost = sourceCost;
	}

	public Integer getSourcePurchaseOrderID() {
		return sourcePurchaseOrderID;
	}

	public void setSourcePurchaseOrderID(Integer sourcePurchaseOrderID) {
		this.sourcePurchaseOrderID = sourcePurchaseOrderID;
	}

	public Timestamp getDatachangeLasttime() {
		return datachangeLasttime;
	}

	public void setDatachangeLasttime(Timestamp datachangeLasttime) {
		this.datachangeLasttime = datachangeLasttime;
	}

	public Timestamp getVBKCancelRequestTime() {
		return vBKCancelRequestTime;
	}

	public void setVBKCancelRequestTime(Timestamp vBKCancelRequestTime) {
		this.vBKCancelRequestTime = vBKCancelRequestTime;
	}

	public BigDecimal getCommissionValue() {
		return commissionValue;
	}

	public void setCommissionValue(BigDecimal commissionValue) {
		this.commissionValue = commissionValue;
	}

	public BigDecimal getCommissionLimit() {
		return commissionLimit;
	}

	public void setCommissionLimit(BigDecimal commissionLimit) {
		this.commissionLimit = commissionLimit;
	}

	public Timestamp getVBKSubmitRequestTime() {
		return vBKSubmitRequestTime;
	}

	public void setVBKSubmitRequestTime(Timestamp vBKSubmitRequestTime) {
		this.vBKSubmitRequestTime = vBKSubmitRequestTime;
	}

	public Long getSubOrderId() {
		return subOrderId;
	}

	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public BigDecimal getOriginalAdultCost() {
		return originalAdultCost;
	}

	public void setOriginalAdultCost(BigDecimal originalAdultCost) {
		this.originalAdultCost = originalAdultCost;
	}

	public BigDecimal getOriginalChildCost() {
		return originalChildCost;
	}

	public void setOriginalChildCost(BigDecimal originalChildCost) {
		this.originalChildCost = originalChildCost;
	}

	public BigDecimal getOriginalBabyCost() {
		return originalBabyCost;
	}

	public void setOriginalBabyCost(BigDecimal originalBabyCost) {
		this.originalBabyCost = originalBabyCost;
	}

	public BigDecimal getOriginalCost() {
		return originalCost;
	}

	public void setOriginalCost(BigDecimal originalCost) {
		this.originalCost = originalCost;
	}

}