package com.rigare.training.kintai_app.repository;

import com.rigare.training.kintai_app.entity.Shain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ShainRepository extends JpaRepository<Shain, Long> {

    // 社員番号で検索 (ログイン認証等で使用)
    Optional<Shain> findByShainBangou(String shainBangou);
}