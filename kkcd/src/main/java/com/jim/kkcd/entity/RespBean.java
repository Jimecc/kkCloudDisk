package com.jim.kkcd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jim
 * @Description 公共返回对象
 * @createTime 2022年06月26日
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespBean {

    private long code;
    private String message;
    private Object obj;

    /**
     * @Author: Jim
     * @Description: 成功调用
     * @param message
     */
    public static RespBean success(String message){return new RespBean(200,message,null);}
    /**
     * @Author: Jim
     * @Description: 成功调用
     * @param message
     * @param obj
     */
    public static RespBean success(String message,Object obj){return new RespBean(200,message,obj);}

    /**
     * @Author: Jim
     * @Description: 失败调用
     * @param message
     */
    public static RespBean error(String message){return new RespBean(500,message,null);}
    /**
     * @Author: Jim
     * @Description: 失败调用
     * @param message
     * @param obj
     */
    public static RespBean error(String message,Object obj){return new RespBean(500,message,obj);}

}
