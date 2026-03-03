package com.rigare.training.kintai_app.repository;

import com.rigare.training.kintai_app.entity.Shain;
import com.rigare.training.kintai_app.entity.Kyuka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface KyukaRepository extends JpaRepository<Kyuka, Long> {

    // 特定社員の申請一覧を取得 (降順: 新しい順)
    List<Kyuka> findByShainOrderByKibouHidukeDesc(Shain shain);

    // ステータス別申請一覧を取得 (管理者承認画面用)
    List<Kyuka> findByStatus(String status);
}