package com.example.demo.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface GoodInfoMapper
{
//    OUnPaidResourcesDTO generateOUnPaidResourcesDTO(OUnPaidResources unPaidResources);
//
//    OUnpaidResourceTrainDTO generateOUnpaidResourceTrainDTO(OUnpaidResourceTrain unpaidResourceTrain);
//
//    OTrainOrderInteractionDetailDTO generateOTrainOrderInteractionDetailDTO(OTrainOrderInteractionDetail trainOrderInteractionDetail);
//
//    OUnPaidResources generateOUnPaidResources(OUnPaidResourcesDTO unPaidResourcesDTO);
//
//    OUnpaidResourceTrain generateOUnpaidResourceTrain(OUnpaidResourceTrainDTO unpaidResourceTrainDTO);
//
//    OTrainOrderInteractionDetail generateOTrainOrderInteractionDetail(OTrainOrderInteractionDetailDTO trainOrderInteractionDetailDTO);

//    @Mappings({
//            @Mapping(source = "tmpOrderID", target = "orderID")
//    })
//    SalesAddInfoDTO generateSalesAddInfoDTO(OnlineSalesAddInfo onlineSalesAddInfo);
//
//    SalesAddInfoDTO generateSalesAddInfoDTO(SalesAddInfo salesAddInfo);
//
//    SalesAddInfo generateSalesAddInfo(SalesAddInfoDTO salesAddInfoDTO);

//    @Mappings({
//            @Mapping(source = "pkId", target = "id"),
//            @Mapping(source = "trainSubOrderId", target = "subOrderId"),
//            @Mapping(source = "errorCode", target = "resultCode"),
//            @Mapping(source = "reason", target = "resultMsg")
//    })
//    SubOrderRequestDto generateSubOrderRequestDto(OnlineOTourTrainSubOrderRequest onlineOTourTrainSubOrderRequest);
//
    @Mappings({
            @Mapping(source = "purchaseOrderID", target = "purchaseOrderId"),
            @Mapping(source = "sourceOrderID", target = "sourceOrderId"),
            @Mapping(source = "orderID", target = "orderId"),
            @Mapping(source = "providerID", target = "providerId"),
            @Mapping(source = "resourceID", target = "resourceId")
    })
    OResourcePurchaseorder generateOResourcePurchaseorder(PurchasePurchaseOrder purchasePurchaseOrder);
    ResourcePurchaseorderDTO generateResourcePurchaseorderDTO(OResourcePurchaseorder purchasePurchaseOrder);

//    @Mappings({
//            @Mapping(source = "subOrderKey", target = "trainSubOrderId"),
//            @Mapping(source = "electronicOrderNumber", target = "trainSubOrderId"),
//    })
}
