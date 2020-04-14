package com.ninja.cloud.config.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/11/28.
 * Description:
 */
@Data
@Accessors(chain = true)
@ApiModel("菜单对象")
@TableName("\"config_menu_${suffix}\"")
public class Menu {
    @TableId
    @ApiModelProperty("自增id")
    private Long id;
    @ApiModelProperty("菜单名")
    private String name;
    @ApiModelProperty("菜单图像")
    private String icon;
    @ApiModelProperty("父节点id")
    private long parentId;
    @ApiModelProperty("类型：1文件 2目录")
    private int type;
    @ApiModelProperty("地址")
    private String uri;
    @ApiModelProperty("排序")
    @TableField("\"order\"")
    private int order;
    @ApiModelProperty(value = "状态：1正常 2 隐藏", required = true)
    private int status;
    @ApiModelProperty("角色权限")
    @TableField(jdbcType = JdbcType.ARRAY)
    private List<String> role;
}
