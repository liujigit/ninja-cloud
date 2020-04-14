package com.ninja.cloud.sdk.resquest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/11/26.
 * Description:
 */
@Data
@Accessors(chain = true)
@ApiModel("错误响应对象")
public class ErrorResponse {
    @ApiModelProperty(value = "错误码", required = true)
    private int errCode;
    @ApiModelProperty("错误信息")
    private String errMsg;
    @ApiModelProperty("错误原因")
    private Throwable cause;
}
