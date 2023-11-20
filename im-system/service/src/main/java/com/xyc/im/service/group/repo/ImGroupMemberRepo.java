package com.xyc.im.service.group.repo;

import com.xyc.im.service.group.entity.ImGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImGroupMemberRepo extends JpaRepository<ImGroupMember,Long> {
}
