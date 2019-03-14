package com.hong.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by hong2 on 11/03/2019
 * Time : 11:04 PM
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class AlertMessage {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private Double version;

    @Column
    private String title;

    @Column
    private String message;
}
