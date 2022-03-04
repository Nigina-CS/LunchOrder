package com.example.lunch.entity.user;

import com.example.lunch.entity.Auditable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "auth_role")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Role extends Auditable {

    @Column(name = "role_code")
    private String code;
}
