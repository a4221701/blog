package com.ssm.ssmMaven.bean;

/**
 * @author shkstart
 * @date 2019/9/20 - 9:55
 */
public class TestBean {
    private Integer id;
    private String username;
    private String password;

    public String toString() {
        return "testBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
