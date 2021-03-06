<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Main</title>
    <link rel="stylesheet" href="../../../css/reset.css">
    <link rel="stylesheet" href="../../../css/admin/shop/board/style.css">
    <script src="https://kit.fontawesome.com/b280fc7aa7.js" crossorigin="anonymous"></script>
</head>

<body>
    <header class="header">
        <h1><a href="../../index.html">logo</a></h1>

        <nav>
            <h1 class="d-none">메뉴</h1>
            <ul>
                <li>
                    <a href="../../user/index.html">회원관리</a>
                </li>
                <li>
                    <a href="../index.html">쇼핑몰</a>
                </li>
                <li>
                    <a href="../../community/index.html">커뮤니티 게시글관리</a>
                </li>
            </ul>
        </nav>
    </header>

    <div class="body">
        <div class="container">
            <h1 class="d-none">쇼핑몰 관리</h1>
            <aside class="aside">
                <nav>
                    <h1 class="d-none">쇼핑몰관리 목록</h1>
                    <ul>
                        <li>
                            <i class="far fa-list-alt"></i>
                            <a href="notice.html">공지사항 관리</a>
                        </li>
                        <li>
                            <i class="fas fa-clipboard-list"></i>
                            <a href="product.html">상품문의 관리</a>
                        </li>
                    </ul>
                </nav>
            </aside>

            <main class="main">
                
                <section>
                    <h1>공지사항 등록</h1>
                    <form>
                        <textarea name="" id="" cols="100" rows="1">제목 입력</textarea>
                    </form>
        
                    <button>이미지</button>
                    <button>동영상</button>
                    <button>링크</button>
                    <button>파일</button>
        
                    <form>
                        <textarea name="" id="" cols="100" rows="10">내용 입력</textarea>
                    </form>
                    <a href=""><input type="button" value="등록"></a>
                </section>

            </main>
        </div>
    </div>

    <footer class="footer">
        <h1>Footer</h1>
    </footer>
</body>

</html>