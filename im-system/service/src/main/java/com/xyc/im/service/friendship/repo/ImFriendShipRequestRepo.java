package com.xyc.im.service.friendship.repo;

import com.xyc.im.service.friendship.entity.ImFriendShipRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImFriendShipRequestRepo extends JpaRepository<ImFriendShipRequest,Long> {
}
