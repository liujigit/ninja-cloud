package com.ninja.cloud.config.mapper;

import com.baomidou.mybatisplus.core.mapper.PgBaseMapper;
import com.ninja.cloud.config.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/11/28.
 * Description:
 */
@Mapper
public interface MenuMapper extends PgBaseMapper<Menu> {
}
