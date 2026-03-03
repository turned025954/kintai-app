package com.rigare.training.kintai_app.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 休暇エンティティ
 * 物理テーブル: 'kyuka'
 */
@Entity
@Table(name = "kyuka")
@Data
public class Kyuka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kyuka_id")
    private Long kyukaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shain_id")
    private Shain shain;

    @Column(name = "kibou_hiduke")
    private LocalDate kibouHiduke;

    @Column(name = "shubetsu")
    private String shubetsu;

    @Column(name = "riyuu")
    private String riyuu;

    @Column(name = "status")
    private String status;

    @Column(name = "sakusei_timestamp", updatable = false)
    private LocalDateTime sakuseiTimestamp;

    @Column(name = "sakusei_user_id", updatable = false)
    private String sakuseiUserId;

    @Column(name = "koushin_timestamp")
    private LocalDateTime koushinTimestamp;

    @Column(name = "koushin_user_id")
    private String koushinUserId;
}