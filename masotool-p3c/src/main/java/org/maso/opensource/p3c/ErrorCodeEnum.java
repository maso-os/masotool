package org.maso.opensource.p3c;


/**
 * p3c错误码列表
 *
 * @author tanpenggood
 */
public enum ErrorCodeEnum {

    CODE_00000("00000", "一切 ok", "正确执行后的返回"),
    CODE_A0001("A0001", "用户端错误", "一级宏观错误码"),
    CODE_A0100("A0100", "用户注册错误", "二级宏观错误码");

    /**
     * 错误码
     */
    private String code;
    /**
     * 中文描述
     */
    private String description;
    /**
     * 说明
     */
    private String explain;

    ErrorCodeEnum(String code, String description, String explain) {
        this.code = code;
        this.description = description;
        this.explain = explain;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getExplain() {
        return explain;
    }
}
