package boj.bronze;

import java.time.LocalDate;
import java.time.ZoneId;

public class BOJ_10699 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(date);
    }
}

// new SimpleDateFormat: 객체 생성과 패턴 컴파일이 상대적으로 빠릅 + 오래된 API + 일부고급기능은 지원x (자바 7 이전)
// DateTimeFormatter: 더 안전하고, 현대적 접근방식 (자바 8 부터 도입)
// LocalDate : 기본적으로 yyyy-mm-dd 형식
// ZoneId.of
// ZoneId.of(String zoneId)를 사용하여 시간대를 나타내는 ZoneId 객체를 생성
// 시간대 식별자(zoneId) 는 Asia/Seoul", "America/New_York"와 같은 문자열을 사용