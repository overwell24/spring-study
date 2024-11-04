<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FREEBOARD DETAIL</title> <!-- 페이지 제목을 설정합니다. -->
</head>
<body>
    <h1>FREEBOARD DETAIL</h1> <!-- 페이지 헤더를 설정합니다. -->
    
    <!-- 게시물 제목을 출력합니다. -->
    <p>제목: ${freeboard.title}</p>
    
    <!-- 게시물 작성자를 출력합니다. -->
    <p>작성자: ${freeboard.writer }</p>
    
    <!-- 게시물 내용을 출력합니다. <pre> 태그를 사용하여 내용의 포맷을 유지합니다. -->
    <pre>${ freeboard.content }</pre>
    
    <!-- 게시물 수정 페이지로 이동하는 버튼 -->
    <button onClick="location.href='/community/freeboard/${freeboard.id}/modify'">수정</button>
    
    <!-- 게시물 목록 페이지로 이동하는 버튼 -->
    <button onClick="location.href='/community/freeboard'">돌아가기</button>
</body>
</html>
