package org.dongguk.study.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.study.dto.UserDto;
import org.dongguk.study.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public UserDto readUserProfile() {
        return userService.readUserProfile();
    }
}
