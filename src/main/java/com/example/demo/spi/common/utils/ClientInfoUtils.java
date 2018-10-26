package com.example.demo.spi.common.utils;

import com.ctrip.tour.order.queryservice.passenger.contract.common.ClientDTO;
import com.ctrip.tour.order.train.actionservice.core.constants.Constants;

import java.util.Calendar;

public class ClientInfoUtils {

    /**
     * 判断年龄是否满18周岁
     * @param beginDate
     * @param endDate
     * @return
     */
    public static boolean checkAgeFullEighteen(Calendar beginDate, Calendar endDate){
        int beginYear = beginDate.get(Calendar.YEAR);
        int endYear = endDate.get(Calendar.YEAR);
        //先比较年份：大于18，成人
        int diffYear = endYear - beginYear;
        if(diffYear > 18){
            return true;
        }
        if(diffYear < 18){
            return false;
        }
        //年龄相差刚好18岁，比较月份
        int beginMonth = beginDate.get(Calendar.MONTH);
        int endMonth = endDate.get(Calendar.MONTH);
        if(endMonth > beginMonth){
            return true;
        }
        if(endMonth < beginMonth){
            return false;
        }
        //年刚好18，月份相同时，比较天
        int beginDay = beginDate.get(Calendar.DAY_OF_MONTH);
        int endDay = endDate.get(Calendar.DAY_OF_MONTH);
        if(endDay < beginDay){
            return false;
        }
        return true;
    }

    public static int getHeightTypeByDate(Calendar useDate, ClientDTO item) {
        int heightType = item.getHeight();
        if (!CollectionUtil.contain(item.getHeight(), Constants.HEIGHT_TYPE_LIST)) {
            // 如果出行人的身高类型非已知，则根据出发日期和生日来计算身高类型
            if (item.getBirthDate() != null) {
                Calendar birthDate = item.getBirthDate();
                if (ClientInfoUtils.checkAgeFullEighteen(birthDate, useDate)) {
                    heightType = 3;
                } else {
                    heightType = 2;
                }
            } else {
                // 未知
                heightType = 0;
            }
        }
        return heightType;
    }
}
