package org.opsli.core.msg;

import org.opsli.common.base.msg.BaseMsg;

/**
 * @BelongsProject: opsli-boot
 * @BelongsPackage: org.opsli.core.msg
 * @Author: Parker
 * @CreateTime: 2020-09-13 19:36
 * @Description: 核心类 - 消息
 */
public enum CoreMsg implements BaseMsg {

    /** SQL */
    SQL_EXCEPTION_UPDATE(10100,"更新数据失败，请稍后再次尝试！"),
    SQL_EXCEPTION_INSERT(10101,"新增数据失败，请稍后再次尝试！"),
    SQL_EXCEPTION_DELETE(10102,"删除数据失败，请稍后再次尝试！"),
    SQL_EXCEPTION_INTEGRITY_CONSTRAINT_VIOLATION(10105,"数据主键冲突或者已有该数据！"),

    /**
     * Redis
     */
    REDIS_EXCEPTION_PUSH_SUB(10200,"Redis 订阅通道失败！"),

    /**
     * MySQL
     */


    ;

    private int code;
    private String message;

    CoreMsg(int code,String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
