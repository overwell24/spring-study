# spring-study

## URI 설계 (커뮤니티)

| 종류               | URL                               | 요청  |
|-------------------|-----------------------------------|-------|
| 공지 사항         | /community/notice                 | GET   |
| FAQ               | /community/faq                    | GET   |
| 게시판 전체 조회  | /community/freeboard/             | GET   |
| 게시판 조회       | /community/freeboard/{id}         | GET   |
| 게시물 작성       | /community/freeboard/create        | GET   |
| 게시물 작성 처리  | /community/freeboard/create        | POST  |
| 게시물 수정       | /community/freeboard/{id}/modify   | GET   |
| 게시물 수정 처리  | /community/freeboard/{id}/modify   | POST  |

