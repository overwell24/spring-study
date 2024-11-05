# spring-study
## 요구 분석 
<img width="70%" alt="Pasted Graphic 2" src="https://github.com/user-attachments/assets/818002ab-3457-4624-9c3c-9cfea5bb2ca3">

## 설계 
### URL 설계
| 종류           | URL                               | 요청 |
|----------------|-----------------------------------|------|
| 메인           | /                                 | GET  |
| 학과소개       | /department/introduction          | GET  |
| 학과 연혁      | /department/history               | GET  |
| 1학년          | /curriculum/grade1                | GET  |
| 2학년          | /curriculum/grade2                | GET  |
| 3학년          | /curriculum/grade3                | GET  |
| 전공심화       | /curriculum/advanced              | GET  |
| 공지 사항      | /community/notice                 | GET  |
| FAQ            | /community/faq                    | GET  |
| 게시판 전체 조회| /community/freeboard/             | GET  |
| 게시판 조회     | /community/freeboard/{id}         | GET  |
| 게시물 작성     | /community/freeboard/create       | GET  |
| 게시물 작성 처리| /community/freeboard/create       | POST |
| 게시물 수정     | /community/freeboard/{id}/modify  | GET  |
| 게시물 수정 처리| /community/freeboard/{id}/modify  | POST |





