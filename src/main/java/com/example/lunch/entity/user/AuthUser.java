package com.example.lunch.entity.user;

import com.example.lunch.entity.Auditable;
import com.example.lunch.enums.Language;
import com.example.lunch.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class AuthUser extends Auditable {
    private String username;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String role;
    private String language;
    private String chatId;
    private Long departmentId;
    private boolean active;
    private boolean blocked;
    private boolean deleted;

    public AuthUser(Long id, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, String username, String password, String fullName, String phoneNumber, String role, String language, String chatId, Long departmentId, boolean active, boolean blocked, boolean deleted) {
        super(id, createdAt, createdBy, updatedAt, updatedBy);
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.role = Role.EMPLOYEE.getName();
        this.language = Language.RUSSIAN.getCode();
        this.chatId = chatId;
        this.departmentId = departmentId;
        this.active = active;
        this.blocked = blocked;
        this.deleted = deleted;
    }
}
