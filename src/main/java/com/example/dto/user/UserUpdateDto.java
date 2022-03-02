package com.example.dto.user;

import com.example.dto.GenericDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserUpdateDto extends GenericDto {
    private String username;
    private String password;
    private String phoneNumber;

    @Builder(builderMethodName = "childBuilder")
    public UserUpdateDto(Long id, String username, String password, String phoneNumber) {
        super(id);
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
