package cn.wolfcode.ssm.domain;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private Integer id;

    private String username;

    private String password;


}