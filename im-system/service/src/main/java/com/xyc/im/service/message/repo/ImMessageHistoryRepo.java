package com.xyc.im.service.message.repo;

import com.xyc.im.service.message.entity.ImMessageHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImMessageHistoryRepo extends JpaRepository<ImMessageHistory,Long> {
}
