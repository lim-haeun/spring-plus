package org.example.expert.domain.todo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TodoSearchRequest {

    // 검색 시작 날짜
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    // 검색 종료 날짜
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    // 날씨 검색 조건
    private String weather;
}
