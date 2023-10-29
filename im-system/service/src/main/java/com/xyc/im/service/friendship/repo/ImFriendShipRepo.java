package com.xyc.im.service.friendship.repo;

import com.xyc.im.service.friendship.ImFriendShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImFriendShipRepo extends JpaRepository<ImFriendShip,Long> {
}




