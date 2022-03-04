package com.example.lunch.entity.meal;


import com.example.lunch.entity.Auditable;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Meal extends Auditable {
    @NotNull
    private String name;
    @Column(unique = true,nullable = false)
    private String image;
    private boolean deleted;
    private Long typeId;
}
