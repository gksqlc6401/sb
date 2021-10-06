package org.zerock.sb.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity//아이디가 필요. 없으면 에러
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;//아이디는 수정불가

    private String title;

    private String content;

    private String writer;

    @CreationTimestamp
    private LocalDateTime regDate;

    @UpdateTimestamp
    private LocalDateTime modDate;

    public void change(String title, String content){//수정하는 메소드
        this.title = title;
        this.content = content;
    }

}
