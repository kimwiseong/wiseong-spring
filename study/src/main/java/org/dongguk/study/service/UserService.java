package org.dongguk.study.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.study.domain.User;
import org.dongguk.study.dto.UserDto;
import org.dongguk.study.repository.UserRepository;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto readUserProfile(Long userId) {

        User user =  userRepository.findById(userId).orElseThrow(() -> new RuntimeException("not found user"));

        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .build();

    }

}
