package org.dongguk.study.dto.request;


import lombok.Builder;
import lombok.Getter;

@Getter
public class DiaryCreateDto {
    Long id;
    String name;
    String title;
    String content;

    @Builder
    public DiaryCreateDto(Long id, String name, String title, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
    }
}
