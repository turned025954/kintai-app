package com.rigare.training.kintai_app.repository;

import com.rigare.training.kintai_app.entity.Kintai;
import com.rigare.training.kintai_app.entity.Shain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface KintaiRepository extends JpaRepository<Kintai, Long> {

    // 指定した社員・期間の勤怠データを取得 (月次一覧用)
    List<Kintai> findByShainAndHidukeBetween(Shain shain, LocalDate startDate, LocalDate endDate);

    // 指定した社員・日付の勤怠データを取得 (日次打刻用)
    Optional<Kintai> findByShainAndHiduke(Shain shain, LocalDate hiduke);
}