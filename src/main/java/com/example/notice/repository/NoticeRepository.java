package com.example.notice.repository;

import com.example.notice.entity.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<
        NoticeEntity, Long> {
}
