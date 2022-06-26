package com.jim.kkcd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jim
 * @since 2022-06-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_share")
@ApiModel(value="Share对象", description="")
public class Share implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String fileId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer disabledDays;

    private LocalDateTime disabledTime;

    private String downloadAddress;

    private Integer status;

    private Integer deleted;


}
