package org.dongguk.study.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.study.dto.request.DiaryCreateDto;
import org.dongguk.study.dto.response.DiaryReadDto;
import org.dongguk.study.service.DiaryService;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@Slf4j
public class DiaryController {

    private final DiaryService diaryService;

    @PostMapping("/create")
    public void create(DiaryCreateDto request) {
        diaryService.create(request);
    }

//    @GetMapping("/create")
//    public void create(DiaryCreateDto request) {
//        diaryService.create(request);
//    }

    @GetMapping("/read/{diaryId}")
    public DiaryReadDto read(@PathVariable(name = "diaryId") Long diaryId) {
        return diaryService.read(diaryId);
    }

}
