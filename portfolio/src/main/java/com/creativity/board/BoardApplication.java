package com.creativity.board;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.creativity.board.domain.Board;
import com.creativity.board.repository.BoardRepository;

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

//  자동 게시글 생성
//	@Bean
//	public CommandLineRunner runner(BoardRepository boardRepository) throws Exception {
//		return (args) -> {
//			IntStream.rangeClosed(1, 100).forEach(index -> boardRepository.save(Board.builder().title("게시글" + index)
//					.content("내용" + index).createdDate(LocalDateTime.now()).updatedDate(LocalDateTime.now()).build()));
//		};
//	}
}
