package com.mapper;

import com.pojo.WxpayV3TransferDetail;
import com.pojo.WxpayV3TransferDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxpayV3TransferDetailMapper {
    long countByExample(WxpayV3TransferDetailExample example);

    int deleteByExample(WxpayV3TransferDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WxpayV3TransferDetail record);

    int insertSelective(WxpayV3TransferDetail record);

    List<WxpayV3TransferDetail> selectByExample(WxpayV3TransferDetailExample example);

    WxpayV3TransferDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WxpayV3TransferDetail record, @Param("example") WxpayV3TransferDetailExample example);

    int updateByExample(@Param("record") WxpayV3TransferDetail record, @Param("example") WxpayV3TransferDetailExample example);

    int updateByPrimaryKeySelective(WxpayV3TransferDetail record);

    int updateByPrimaryKey(WxpayV3TransferDetail record);
}