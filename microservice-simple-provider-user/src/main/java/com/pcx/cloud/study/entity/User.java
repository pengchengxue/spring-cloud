package com.pcx.cloud.study.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description:    用户类
 * @Author:         pcx
 * @CreateDate:     2019/7/30 0:44
 * @UpdateUser:     pcx
 * @UpdateDate:     2019/7/30 0:44
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;

}
