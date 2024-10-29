

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum StatusCode {
    SUCCESS(2000, "OK"),
    LOGIN_SUCCESS(2001, "登录成功"),
    OPERATION_SUCCESS(2002, "操作成功"),
    EMAIL_SERVICE_ERROR(2003, "邮箱服务出错"),
    BUSY_OPERATION(2004, "操作繁忙"),
    SERVICE_ERROR(2005, "响应服务器出错"),

    NOT_LOGIN(4000, "未登录"),
    PASSWORD_ERROR(4002, "邮箱或密码错误"),
    EMAIL_ERROR(4003, "邮箱或密码错误"),
    NOT_GET_CODE(4004, "请先获取验证码"),
    REG_CODE_ERROR(4005, "验证码错误"),
    TOKEN_UNEXISTS(4006, "令牌过期"),
    REG_URL_EXISTS(4007, "请检查邮箱，已发送确认注册链接"),
    AVATAR_ERROR(4008, "头像更换频繁，请1天后再试"),
    NICKNAME_ERROR(4009, "昵称频繁更换"),
    NICKNAME_NULL(4010, "昵称不允许为空"),
    NICKNAME_LENGTH(4011, "昵称过长"),
    BG_ERROR(4012, "背景频繁更换"),
    BG_EXISTS(4013, "背景重复更换"),
    NICKNAME_EXISTS(4014, "昵称重复更换"),
    AVATAR_EXISTS(4015, "头像重复更换"),

    OPERATION_FAILED(5001, "操作失败"),
    VALIDATE_ERROR(5002, "请求参数错误"),
    EMAIL_ALREADY_EXISTS(5003, "邮箱已注册"),
    EMAIL_IS_NULL(5004, "邮箱未注册"),
    DATA_UNEXISTS(5005, "请求数据不存在"),
    ;
    //状态码、状态码描述
    private Integer code;
    private String msg;
}