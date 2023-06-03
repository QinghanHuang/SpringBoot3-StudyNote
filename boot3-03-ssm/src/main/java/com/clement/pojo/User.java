package com.clement.pojo;

import lombok.*;

/**
 * @Author Qinghan Huang
 * @Date 2023/6/3 18:13
 * @Desc
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String nickname;
    private String password;
}