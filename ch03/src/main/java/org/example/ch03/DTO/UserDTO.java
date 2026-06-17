package org.example.ch03.DTO;

import lombok.*;

@Getter
@Setter
@ToString
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String userid;
    private String name;
    private String birth;
    private int age;

}
