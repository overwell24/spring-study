<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 수정</title> 
</head>
<body>
<h1>게시판 수정</h1>
    <!-- 게시물 수정 폼 시작 -->
    <form action="/community/freeboard/${freeboard.id}/modify" method="post">
        <!-- 작성자 정보는 숨겨진 필드로 설정합니다. -->
        <input type="hidden" value="guest" name="writer">
        
        <!-- 제목 입력 필드 -->
        제목<br> 
        <input type="text" name="title" value="${freeboard.title}"> <br> 
        
        <!-- 내용 입력 필드 -->
        내용 <br>
        <textarea name="content" rows="4" cols="15">${freeboard.content}</textarea>
        <br>
        
        <!-- 수정 버튼 -->
        <button type="submit">수정</button>
    </form>
    <!-- 게시물 수정 폼 끝 -->
</body>
</html>
