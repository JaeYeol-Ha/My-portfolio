package com.creativity.board.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.creativity.board.domain.Board;
 
public interface BoardRepository extends JpaRepository<Board, Long> {
}