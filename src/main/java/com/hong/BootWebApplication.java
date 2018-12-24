package com.hong;

import com.hong.domain.Board;
import com.hong.domain.User;
import com.hong.domain.enums.BoardType;
import com.hong.repository.BoardRepository;
import com.hong.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.stream.IntStream;


/**
 * Created by hong2 on 09/11/2018
 * Time : 12:18 AM
 */

@SpringBootApplication
public class BootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootWebApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner runner(UserRepository userRepository, BoardRepository boardRepository) throws Exception {
        return (args -> {
            User user = userRepository.save(User.builder()
                    .name("havi")
                    .password("test")
                    .email("havi@gmail.com")
                    .createdDate(LocalDateTime.now())
                    .build());

            IntStream.rangeClosed(1, 200).forEach(index ->
                    boardRepository.save(Board.builder()
                            .title("게시글" + index)
                            .subTitle("순서" + index)
                            .content("콘텐츠")
                            .boardType(BoardType.free)
                            .createDate(LocalDateTime.now())
                            .updatedDate(LocalDateTime.now())
                            .user(user)
                            .build()));
        });
    }*/
}
