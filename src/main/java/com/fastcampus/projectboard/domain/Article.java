package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class Article {

    private Long id;   // id
    private String title;   // 게시글제목
    private String content;   // 내용
    private String hashtag;   // 해시태그

    private LocalDateTime createdAt;  // 생성일자
    private String createdBy;   // 생성자
    private LocalDateTime modifiedAt;   // 수정일자
    private String modifiedBy;   // 수정자

}
