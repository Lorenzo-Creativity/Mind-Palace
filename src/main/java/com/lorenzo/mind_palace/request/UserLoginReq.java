package com.lorenzo.mind_palace.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @author libocheng
 */
public class UserLoginReq {

    @NotEmpty(message = "【用户名】不能为空")
    private String loginName;

    // @Length(min = 6, max = 20, message = "【密码】6~20位")
    @NotEmpty(message = "【密码】不能为空")
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,32}$", message = "【密码】规则不正确")
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", loginName=" + loginName +
                ", password=" + password +
                "]";
    }
}