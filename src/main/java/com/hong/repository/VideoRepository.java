package com.hong.repository;

import com.hong.domain.VideoCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hong2 on 04/02/2019
 * Time : 3:53 PM
 */

public interface VideoRepository extends JpaRepository<VideoCategory, Long> {

}
