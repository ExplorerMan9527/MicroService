package model;

import java.io.Serializable;

/**
 * @author guangjie.Liao
 * @Title: User
 * @ProjectName micro-parent
 * @Description: TODO
 * @date 2018/10/1214:44
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String email;


    public User(){

    }

    public User(Integer id, String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
