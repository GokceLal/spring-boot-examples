package org.example.dto.request;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class RegisterRequestDto {
    @NotNull
            @Size(min = 3,max = 64)
    String userName;
    @NotNull
            @Email
    String email;
    @NotNull
            @Size(min = 8)
    String password;
    @NotNull
            @Size(min = 8)
    String rePassword;

}
