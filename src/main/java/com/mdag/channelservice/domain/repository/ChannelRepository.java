package com.mdag.channelservice.domain.repository;

import com.mdag.channelservice.domain.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel,Long> {

    Channel findChannelByTitle(String title);
}
