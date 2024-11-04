<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판</title> <!-- 페이지 제목을 설정합니다. -->
</head>
<body>
    <h1>자유게시판</h1> <!-- 페이지 헤더를 설정합니다. -->
    
    <!-- 글쓰기 버튼 -->
    <button onClick="location.href=window.location.pathname + '/create'">글쓰기</button>
    
    <!-- 게시물 목록 테이블 -->
    <table border="1">
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
            </tr>
        </thead>
        <tbody>
            <!-- 게시물 목록을 출력하는 반복문 -->
            <c:forEach var="freeboard" items="${freeboardList}">
                <tr>
                    <!-- 게시물 번호와 제목을 출력하고, 게시물 상세 페이지로 링크를 걸어줍니다. -->
                    <td><a href="/community/freeboard/${freeboard.id}">${freeboard.id}</a></td>
                    <td>${freeboard.title}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <!-- 게시물 목록 테이블 끝 -->
</body>
</html>
