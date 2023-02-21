package com.example.notice.entity;


import com.example.notice.dto.NoticeDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "notice_table")
public class NoticeEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String noticeWriter;

    @Column
    private String noticePass;

    @Column
    private String noticeTitle;

    @Column(length = 500)
    private String noticeContents;

    @Column
    private int noticeHits;

    public static NoticeEntity toSaveEntity(NoticeDTO noticeDto) {
        NoticeEntity noticeEntity = new NoticeEntity();
        noticeEntity.setNoticeWriter(noticeDto.getNoticeWriter());
        noticeEntity.setNoticePass(noticeDto.getNoticePass());
        noticeEntity.setNoticeTitle(noticeDto.getNoticeTitle());
        noticeEntity.setNoticeContents(noticeDto.getNoticeContents());
        noticeEntity.setNoticeHits(0);
        return noticeEntity;

    }

}
