package org.dongguk.study.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.study.domain.Diary;
import org.dongguk.study.dto.request.DiaryCreateDto;
import org.dongguk.study.dto.request.DiaryUpdateDto;
import org.dongguk.study.dto.response.DiaryReadDto;
import org.dongguk.study.repository.DiaryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Slf4j
@Service
@RequiredArgsConstructor
public class DiaryService {

    private final DiaryRepository diaryRepository;

    public void create(DiaryCreateDto diaryCreate) {
        Diary diary = Diary.builder()
                .title(diaryCreate.getTitle())
                .content(diaryCreate.getContent())
                .build();

        diaryRepository.save(diary);
    }

    public DiaryReadDto read(Long id) {
        Diary diary = diaryRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("not found diary"));

        return DiaryReadDto.builder()
                .id(diary.getId())
                .title(diary.getTitle())
                .content(diary.getContent())
                .build();
    }

    @Transactional
    public void edit(Long id, DiaryUpdateDto diaryUpdateDto) {
        Diary diary = diaryRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("not found diary"));

        diary.edit(diaryUpdateDto.getTitle(),
                diaryUpdateDto.getContent());
    }

    @Transactional
    public void inactive(Long id) {
        Diary diary = diaryRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("not found diary"));

        diary.inactive();
    }

    public void delete(Long id) {
        Diary diary = diaryRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("not found diary"));

        diaryRepository.delete(diary);

    }


}
