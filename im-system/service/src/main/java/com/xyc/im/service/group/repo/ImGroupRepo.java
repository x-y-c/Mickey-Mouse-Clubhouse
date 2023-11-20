package com.xyc.im.service.group.repo;

import com.xyc.im.service.group.entity.ImGroup;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImGroupRepo extends JpaRepository<ImGroup,Long> {
}
