<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 작성</title> <!-- 페이지 제목을 설정합니다. -->
</head>
<body>
    <h1>게시물 작성</h1> <!-- 페이지 헤더를 설정합니다. -->
    
    <!-- 게시물 작성 폼 -->
    <form action="${requestScope['javax.servlet.forward.request_uri']}" method="post">
        <!-- 작성자 정보는 숨겨진 필드로 설정합니다. -->
        <input type="hidden" value="guest" name="writer">
        
        <!-- 제목 입력 필드 -->
        제목<br> 
        <input type="text" name="title"> <br> 
        
        <!-- 내용 입력 필드 -->
        내용 <br>
        <textarea name="content" rows="4" cols="15"></textarea>
        <br>
        
        <!-- 작성 버튼 -->
        <button type="submit">작성</button>
    </form>
    <!-- 게시물 작성 폼 끝 -->
</body>
</html>
