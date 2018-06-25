package cn.xuyangl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author: liuXuyang
 * @studentNo 15130110024
 * @Emailaddress 1187697635@qq.com
 * @Date: 2018/6/12 18:43
 */
@Data
@NoArgsConstructor
public class User {

    int id;
    String name;
    String password;
    int age;
    String email;
    String sex;
    Account account;

    public User(String name, int age, String email, String sex) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.sex = sex;
    }
}
