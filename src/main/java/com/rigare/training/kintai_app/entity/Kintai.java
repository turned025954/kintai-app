package com.rigare.training.kintai_app.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 勤怠エンティティ
 * 物理テーブル: 'kintai'
 */
@Entity
@Table(name = "kintai")
@Data
public class Kintai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kintai_id")
    private Long kintaiId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shain_id")
    private Shain shain;

    @Column(name = "hiduke")
    private LocalDate hiduke;

    @Column(name = "shukkin_jikoku")
    private LocalTime shukkinJikoku;

    @Column(name = "taikin_jikoku")
    private LocalTime taikinJikoku;

    @Column(name = "kyukei_jikan")
    private LocalTime kyukeiJikan;

    @Column(name = "status")
    private String status;

    @Column(name = "bikou")
    private String bikou;

    @Column(name = "sakusei_timestamp", updatable = false)
    private LocalDateTime sakuseiTimestamp;

    @Column(name = "sakusei_user_id", updatable = false)
    private String sakuseiUserId;

    @Column(name = "koushin_timestamp")
    private LocalDateTime koushinTimestamp;

    @Column(name = "koushin_user_id")
    private String koushinUserId;
}