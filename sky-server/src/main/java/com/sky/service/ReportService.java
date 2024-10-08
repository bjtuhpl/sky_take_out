package com.sky.service;

import com.sky.vo.OrderReportVO;
import com.sky.vo.SalesTop10ReportVO;
import com.sky.vo.TurnoverReportVO;
import com.sky.vo.UserReportVO;

import java.time.LocalDate;


public interface ReportService {

    /**
     * 统计指定时间区间类营业额的数据
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin,LocalDate end);


    /**
     * 统计指定时间区间类用户的数据
     * @param begin
     * @param end
     * @return
     */
    UserReportVO getUserStatistics(LocalDate begin, LocalDate end);


    /**
     * 统计指定时间区间内用订单数量
     * @param begin
     * @param end
     * @return
     */
     OrderReportVO getOrderStatistics(LocalDate begin, LocalDate end);


    /**
     * 统计时间区间内的销量排名
     * @param begin
     * @param end
     * @return
     */
    SalesTop10ReportVO getSalesTop10(LocalDate begin, LocalDate end);
}
