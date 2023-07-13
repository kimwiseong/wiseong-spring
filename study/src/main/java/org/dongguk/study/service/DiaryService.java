package org.dongguk.study.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.study.domain.Diary;
import org.dongguk.study.dto.request.DiaryCreateDto;
import org.dongguk.study.dto.response.DiaryReadDto;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class DiaryService {

    public DiaryReadDto read(Long diaryId) {
        return DiaryReadDto.builder()
                .id(0L)
                .name("김위성")
                .title("title1")
                .content("content1")
                .build();
    }

    public void create(DiaryCreateDto diaryCreate) {
//        Diary diary = Diary.builder()
//                .title(diaryCreate.getTitle())
//                .content(diaryCreate.getContent())
//                .build();


        log.info("title = {}", diaryCreate.getTitle());
        log.info("content = {}", diaryCreate.getContent());
//        diaryRepository.create(diary)
    }
}
