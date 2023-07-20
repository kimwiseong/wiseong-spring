package org.dongguk.study.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dongguk.study.dto.request.DiaryUpdateDto;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Timestamp;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "diary")
@DynamicUpdate
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

//    @Column(name = "name", nullable = false)
//    private String name;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "create_date")
    private Timestamp createDate;

    @Enumerated(EnumType.STRING)
    private DiaryStatus status;

//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name = "user_id")
//    private User user;

    @Builder
    public Diary(Long id, String title, String content, Timestamp createDate, DiaryStatus status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.status = status;
    }


    public void edit(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void inactive() {
        status = DiaryStatus.INACTIVE;
    }

}
