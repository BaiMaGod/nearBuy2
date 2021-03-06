package com.dao;

import com.model.Goods;
import com.model.Goodsvideo;
import com.model.GoodsvideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsvideoMapper extends BaseDao<Goodsvideo>{

    long countByExample(GoodsvideoExample example);

    int deleteByExample(GoodsvideoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Goodsvideo record);
    List<Goodsvideo> selectByAllBypage();
    int insertSelective(Goodsvideo record);

    List<Goodsvideo> selectByExample(GoodsvideoExample example);

    Goodsvideo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Goodsvideo record, @Param("example") GoodsvideoExample example);

    int updateByExample(@Param("record") Goodsvideo record, @Param("example") GoodsvideoExample example);

    int updateByPrimaryKeySelective(Goodsvideo record);

    int updateByPrimaryKey(Goodsvideo record);
}