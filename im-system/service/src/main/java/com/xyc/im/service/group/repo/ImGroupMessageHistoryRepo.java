package com.xyc.im.service.group.repo;

import com.xyc.im.service.group.entity.ImGroupMessageHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImGroupMessageHistoryRepo extends JpaRepository<ImGroupMessageHistory,Long> {
}
