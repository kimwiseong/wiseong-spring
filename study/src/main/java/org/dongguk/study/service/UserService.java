package org.dongguk.study.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.study.dto.UserDto;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    public UserDto readUserProfile() {

        return UserDto.builder()
                .id(0L)
                .name("정구연")
                .introduction("hi")
                .build();
    }
}
