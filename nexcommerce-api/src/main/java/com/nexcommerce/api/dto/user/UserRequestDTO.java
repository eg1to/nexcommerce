package com.nexcommerce.api.dto.user;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserRequestDTO {
    private String name;
    private String email;
    private String password;
}
