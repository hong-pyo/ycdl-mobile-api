package com.hong.repository;

import com.hong.domain.video.VideoContent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hong2 on 18/02/2019
 * Time : 1:55 AM
 */

public interface VideoContentsRepository extends JpaRepository<VideoContent, Long> {
}
