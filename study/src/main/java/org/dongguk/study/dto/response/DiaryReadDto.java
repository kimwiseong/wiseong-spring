package org.dongguk.study.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;

@Getter
@RequiredArgsConstructor
public class DiaryReadDto {
    private Long id;
    private String name;
    private String title;
    private String content;
    private Timestamp createDate;

    @Builder
    public DiaryReadDto(Long id, String name, String title, String content, Timestamp createDate) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
    }

}
