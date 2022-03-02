package com.example.dto.user;

import com.example.dto.GenericDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto extends GenericDto {
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

    public UserDto(Long id, String username, String password, String fullName, String phoneNumber, String role, String language, String chatId, Long departmentId, boolean active, boolean blocked, boolean deleted) {
        super(id);
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.language = language;
        this.chatId = chatId;
        this.departmentId = departmentId;
        this.active = active;
        this.blocked = blocked;
        this.deleted = deleted;
    }

    @Builder(builderMethodName = "childBuilder")
    public UserDto(Long id, String username, String password, String fullName, String phoneNumber, String role, String language, String chatId, Long departmentId) {
        super(id);
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.language = language;
        this.chatId = chatId;
        this.departmentId = departmentId;
    }
}
