package org.dongguk.study.domain;


import lombok.Builder;
import lombok.Getter;

import java.util.Date;


@Getter
public class Diary {
    private Long id;
    private String name;
    private String title;
    private String content;
    private Date date;

    @Builder
    public Diary(Long id, String name, String title, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.content = content;
    }

}
