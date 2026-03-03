package com.rigare.training.kintai_app.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 社員エンティティ
 * 物理テーブル: 'shain'
 */
@Entity
@Table(name = "shain")
@Data
public class Shain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shain_id")
    private Long shainId;

    @Column(name = "shain_bangou")
    private String shainBangou;

    @Column(name = "shimei")
    private String shimei;

    @Column(name = "password")
    private String password;

    @Column(name = "mail_address")
    private String mailAddress;

    @Column(name = "busho")
    private String busho;

    @Column(name = "kengen_role")
    private String kengenRole;

    @Column(name = "sakusei_timestamp", updatable = false)
    private LocalDateTime sakuseiTimestamp;

    @Column(name = "sakusei_user_id", updatable = false)
    private String sakuseiUserId;

    @Column(name = "koushin_timestamp")
    private LocalDateTime koushinTimestamp;

    @Column(name = "koushin_user_id")
    private String koushinUserId;
}