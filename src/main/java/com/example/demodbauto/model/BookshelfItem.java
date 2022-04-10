package com.example.demodbauto.model;

import com.rdxer.db.auto.annotation.AutoColumn;
import com.rdxer.db.auto.annotation.AutoTable;
import lombok.Data;

@Data
@AutoTable
public class BookshelfItem {

    // id  bigserial primary key,
    @AutoColumn(isKey = true, isAutoIncrement = true)
    private Long id;
    // strv1    varchar(255),
    private String strv1;
    // strv2    varchar(255),
    private String strv2;

    // vint     integer          not null,
    private int vint;
    // vfloat   real             not null,
    private float vfloat;
    // vdouble  double precision not null,
    private double vdouble;

    //  vint2    integer
    private Integer vint2;
    // vfloat2  real,
    private Float vfloat2;
    // vdouble2 double precision,
    private Double vdouble2;
    private Double vdouble222;
    @AutoColumn(isNull = false)
    private Double vdouble22222;
    @AutoColumn(isUnique = true)
    private Integer intkey1;

    // alter table bookshelf add column vdouble21 float8

}