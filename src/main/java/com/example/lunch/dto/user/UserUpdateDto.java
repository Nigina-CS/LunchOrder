package com.example.lunch.dto.user;

import com.example.lunch.dto.GenericDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserUpdateDto extends GenericDto {
    private String username;
    private String phoneNumber;

    @Builder(builderMethodName = "childBuilder")
    public UserUpdateDto(Long id, String username, String phoneNumber) {
        super(id);
        this.username = username;
        this.phoneNumber = phoneNumber;
    }
}
