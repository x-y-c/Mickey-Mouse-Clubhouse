package com.xyc.im.service.friendship.repo;

import com.xyc.im.service.friendship.ImFriendShipGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImFriendShipGroupRepo extends JpaRepository<ImFriendShipGroup, Long> {
}
