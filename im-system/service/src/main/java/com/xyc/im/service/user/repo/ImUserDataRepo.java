package com.xyc.im.service.user.repo;

import com.xyc.im.service.user.ImUserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImUserDataRepo extends JpaRepository<ImUserData,Long> {
}
