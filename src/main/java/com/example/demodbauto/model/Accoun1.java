package com.example.demodbauto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.rdxer.db.auto.annotation.AutoColumn;
import com.rdxer.db.auto.annotation.AutoColumnIgnore;
import com.rdxer.db.auto.annotation.AutoTable;
import lombok.Data;

@Data
@AutoTable(name = "account1", comment = "账户表1")
public class Accoun1 {
    @JsonSerialize(using= ToStringSerializer.class)
    // @TableId(type = IdType.ASSIGN_ID) // Mybatis+ 的配置
    @AutoColumn(isKey = true,comment = "id字段")
    private Long id;
    @AutoColumn(isUnique = true)
    private String username;
    @JsonIgnore
    private String password;
    // 显示名称
    private String displayName;
    @AutoColumn(isUnique = true)
    private String email;
    @AutoColumn(isUnique = true)
    private String phone;
    @AutoColumn(define = "text")
    private String avatar;
    // 忽略此字段
    @AutoColumnIgnore
    private String avatarIgnore;
    
    // 创建时间
    private Long createAt;
    // 如果为 null 则 未禁用
    // 禁用时间
    private Long disabledAt;
    // 删除时间
    private Long deleteAt;
}