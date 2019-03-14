package com.hong.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by hong2 on 15/03/2019
 * Time : 12:40 AM
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "error_history")
public class ErrorResultDto implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String errorMessage;
    @Column
    private int errorCode;
    @Column
    private LocalDateTime createDate;
}
