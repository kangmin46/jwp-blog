# My Blog

## 1. 기능 구현

### 1.1. 게시판
- 게시판 생성 기능
   - POST form을 통해 서버로 전송 (제목, 배경 url, 본문)
   - 전송받은 객체를 토대로 Article 객체 생성
   - Article을 list에 저장

- 게시글 조회 기능
   - GET method를 활용하여 전체 조회
   - 사용자에게 받은 데이터를 토대로 해당 게시글 조회

- 게시글 수정 기능
   - GET 수정 클릭 시, 해당 게시글의 데이터를 받음
   - PUT 수정된 게시글을 리스트에 저장

- 게시글 삭제 기능
   - DELETE 해당 게시글을 삭제