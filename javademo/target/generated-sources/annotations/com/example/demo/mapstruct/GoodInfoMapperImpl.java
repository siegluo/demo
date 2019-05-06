package com.example.demo.mapstruct;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class GoodInfoMapperImpl implements GoodInfoMapper {

    @Override
    public OResourcePurchaseorder generateOResourcePurchaseorder(PurchasePurchaseOrder purchasePurchaseOrder) {
        if ( purchasePurchaseOrder == null ) {
            return null;
        }

        OResourcePurchaseorder oResourcePurchaseorder = new OResourcePurchaseorder();

        oResourcePurchaseorder.setSourceOrderId( purchasePurchaseOrder.getSourceOrderID() );
        if ( purchasePurchaseOrder.getResourceID() != null ) {
            oResourcePurchaseorder.setResourceId( purchasePurchaseOrder.getResourceID().longValue() );
        }
        oResourcePurchaseorder.setOrderId( purchasePurchaseOrder.getOrderID() );
        if ( purchasePurchaseOrder.getPurchaseOrderID() != null ) {
            oResourcePurchaseorder.setPurchaseOrderId( purchasePurchaseOrder.getPurchaseOrderID().longValue() );
        }
        if ( purchasePurchaseOrder.getProviderID() != null ) {
            oResourcePurchaseorder.setProviderId( purchasePurchaseOrder.getProviderID().longValue() );
        }
        oResourcePurchaseorder.setSourceOrderType( purchasePurchaseOrder.getSourceOrderType() );
        oResourcePurchaseorder.setStatus( purchasePurchaseOrder.getStatus() );
        oResourcePurchaseorder.setCost( purchasePurchaseOrder.getCost() );
        oResourcePurchaseorder.setQuantity( purchasePurchaseOrder.getQuantity() );
        oResourcePurchaseorder.setResourceType( purchasePurchaseOrder.getResourceType() );
        oResourcePurchaseorder.setResourceName( purchasePurchaseOrder.getResourceName() );
        oResourcePurchaseorder.setResourceDesc( purchasePurchaseOrder.getResourceDesc() );
        oResourcePurchaseorder.setSegment( purchasePurchaseOrder.getSegment() );
        oResourcePurchaseorder.setAdultQuantity( purchasePurchaseOrder.getAdultQuantity() );
        oResourcePurchaseorder.setChildQuantity( purchasePurchaseOrder.getChildQuantity() );
        oResourcePurchaseorder.setAdultCost( purchasePurchaseOrder.getAdultCost() );
        oResourcePurchaseorder.setChildCost( purchasePurchaseOrder.getChildCost() );
        oResourcePurchaseorder.setUseDate( purchasePurchaseOrder.getUseDate() );
        oResourcePurchaseorder.setCurrency( purchasePurchaseOrder.getCurrency() );
        oResourcePurchaseorder.setExchange( purchasePurchaseOrder.getExchange() );
        oResourcePurchaseorder.setDatachangeLasttime( purchasePurchaseOrder.getDatachangeLasttime() );

        return oResourcePurchaseorder;
    }

    @Override
    public ResourcePurchaseorderDTO generateResourcePurchaseorderDTO(OResourcePurchaseorder purchasePurchaseOrder) {
        if ( purchasePurchaseOrder == null ) {
            return null;
        }

        ResourcePurchaseorderDTO resourcePurchaseorderDTO = new ResourcePurchaseorderDTO();

        resourcePurchaseorderDTO.setPurchaseOrderId( purchasePurchaseOrder.getPurchaseOrderId() );
        resourcePurchaseorderDTO.setOrderId( purchasePurchaseOrder.getOrderId() );
        resourcePurchaseorderDTO.setSourceOrderId( purchasePurchaseOrder.getSourceOrderId() );
        resourcePurchaseorderDTO.setSourceOrderType( purchasePurchaseOrder.getSourceOrderType() );
        resourcePurchaseorderDTO.setStatus( purchasePurchaseOrder.getStatus() );
        resourcePurchaseorderDTO.setCost( purchasePurchaseOrder.getCost() );
        resourcePurchaseorderDTO.setQuantity( purchasePurchaseOrder.getQuantity() );
        resourcePurchaseorderDTO.setResourceId( purchasePurchaseOrder.getResourceId() );
        resourcePurchaseorderDTO.setResourceType( purchasePurchaseOrder.getResourceType() );
        resourcePurchaseorderDTO.setResourceName( purchasePurchaseOrder.getResourceName() );
        resourcePurchaseorderDTO.setResourceDesc( purchasePurchaseOrder.getResourceDesc() );
        resourcePurchaseorderDTO.setSegment( purchasePurchaseOrder.getSegment() );
        resourcePurchaseorderDTO.setAdultQuantity( purchasePurchaseOrder.getAdultQuantity() );
        resourcePurchaseorderDTO.setChildQuantity( purchasePurchaseOrder.getChildQuantity() );
        resourcePurchaseorderDTO.setAdultCost( purchasePurchaseOrder.getAdultCost() );
        resourcePurchaseorderDTO.setChildCost( purchasePurchaseOrder.getChildCost() );
        resourcePurchaseorderDTO.setEid( purchasePurchaseOrder.getEid() );
        resourcePurchaseorderDTO.setRemark( purchasePurchaseOrder.getRemark() );
        resourcePurchaseorderDTO.setUseDate( purchasePurchaseOrder.getUseDate() );
        resourcePurchaseorderDTO.setCurrency( purchasePurchaseOrder.getCurrency() );
        resourcePurchaseorderDTO.setExchange( purchasePurchaseOrder.getExchange() );
        resourcePurchaseorderDTO.setProviderId( purchasePurchaseOrder.getProviderId() );
        resourcePurchaseorderDTO.setDatacreateLasttime( purchasePurchaseOrder.getDatacreateLasttime() );
        resourcePurchaseorderDTO.setDatachangeLasttime( purchasePurchaseOrder.getDatachangeLasttime() );

        return resourcePurchaseorderDTO;
    }
}
