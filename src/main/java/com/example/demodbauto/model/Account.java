package com.example.demodbauto.model;

import com.rdxer.db.auto.annotation.AutoColumn;
import com.rdxer.db.auto.annotation.AutoTable;
import lombok.Data;

@Data
@AutoTable
public class Account {
    @AutoColumn(isKey = true)
    private Long id;
    @AutoColumn(isUnique = true,len = "150")
    private String name;
    private Integer age;
    private String email;
    @AutoColumn(define = "text")
    private String bio;
    @AutoColumn(isUnique = true)
    private String email1;
    @AutoColumn(isUnique = true)
    private String email2;
}