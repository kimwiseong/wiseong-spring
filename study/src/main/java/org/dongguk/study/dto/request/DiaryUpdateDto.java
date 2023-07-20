package org.dongguk.study.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DiaryUpdateDto {

    private String title;

    private String content;

    @Builder
    public DiaryUpdateDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
