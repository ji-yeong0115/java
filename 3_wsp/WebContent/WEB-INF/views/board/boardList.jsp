<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.kh.wsp.board.model.vo.Board"%>
<%@page import="java.util.List"%>
<%@page import="com.kh.wsp.board.model.vo.Page"%>
<%@page import="com.kh.wsp.board.model.vo.Attachment"%>

<%
	Page pInfo = (Page)request.getAttribute("pInfo");
	List<Board> bList = (List<Board>)request.getAttribute("bList");
	List<Attachment> fList = (List<Attachment>)request.getAttribute("fList");
	
	int currentPage = pInfo.getCurrentPage();
	int listCount = pInfo.getListCount();
	int maxPage = pInfo.getMaxPage();
	int startPage = pInfo.getStartPage();
	int endPage = pInfo.getEndPage();
	int boardType = pInfo.getBoardType();
	
	
	int prev = (currentPage-1)/10 * 10;
	int next = (currentPage+9)/10 *10 + 1;
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
    <style>
    	.pagination {
            justify-content: center;
        }
        #searchForm{
            position: relative;
        }

        #searchForm>*{
            top : 0;
        }
        
        .boardTitle > img{
        	width: 50px;
        	height: 50px;
        }
        
	</style>
	
</head>
<body>
	<div class="container">
		<%@ include file="../common/header.jsp"%>

		<div class="container">
	        <div class="my-5">
	            <table class="table table-hover table-striped" id="list-table">
	                <thead>
	                    <tr>
	                        <th>글번호 </th>
	                        <th>카테고리 </th>
	                        <th>제목</th>
	                        <th>작성자</th>
	                        <th>조회수</th>
	                        <th>작성일</th>
	                    </tr>
	                </thead>
	                <tbody>
	                
	                	<%if(bList.isEmpty()) { %>
	                		<tr><td colspan="6">존재하는 게시글이 없습니다.</td></tr>
	                	<%} else {%>
	                		<%for(Board board : bList){ %>
	                			<tr>
	                				<td><%=board.getBoardNo() %></td>
	                				<td><%=board.getCategoryName() %></td>
	                				<td class="boardTitle">
	                					<!-- 썸네일 추가 -->
	                					<%
	                						String src = null;
	                						for(Attachment at : fList){
	                							if(at.getParentBoardNo() == board.getBoardNo()){
	                								src = request.getContextPath()
	                										+ "/resources/uploadImages/" + at.getFileChangeName();
	                								%>
	                								
	                									<img src="<%=src %>">
	                								<% 
	                							}
	                						}
	                					%>
	                					
	                					<%=board.getBoardTitle() %>
	                					
	                				</td>
	                				<td><%=board.getMemberId() %></td>
	                				<td><%=board.getReadCount() %></td>
	                				<td><%=board.getBoardCreateDate() %></td>
	                			</tr>
	                		<%} %>
	                	<%} %>
	                
	                </tbody>
	            </table>
	        </div>
	
	        <hr>
	        
	        <%-- 로그인이 되어있는 경우 --%>
	        <% if(loginMember != null) {%>
	        <button type="button" class="btn btn-primary float-right" id="insertBtn" onclick="location.href = 'insertForm.do?type=<%=boardType%>';">글쓰기</button>
	        <% } %>
	        
	        <!-- 페이징바 -->
	        <div style="clear : both">
	        	<ul class="pagination">
	        		<%if(currentPage > 10){ %>
	        		<!-- 맨 처음 페이지로 이동 [<<] -->
	        		<li>
	        			<a class="page-link" href="<%=request.getContextPath()%>/board/list.do?type=<%=boardType%>&cp=1">&lt;&lt;</a>
	        		</li>	
	        			
	        		<!-- 이전 순번의 페이징바로 이동 [<] -->	
	        		<li>
	        			<a class="page-link" href="<%=request.getContextPath()%>/board/list.do?type=<%=boardType%>&cp=<%=prev%>">&lt;</a>
	        		</li>
	        		<%} %>
	        		
	        		<!-- 10개의 페이지 목록 -->
		        		<%for(int p = startPage; p <= endPage; p++) {%>
		        			<%if( p == currentPage){ %>
		        				<li><a class="page-link"><%=p %></a></li>
		        			
		        			<%} else{%>
	        					<li>
	        						<a class="page-link" href="<%=request.getContextPath()%>/board/list.do?type=<%=boardType%>&cp=<%=p%>"><%=p %></a>
	        					</li>
		        			<%} %>
		        		<%} %>	
		        		
		        		<%if(next < maxPage){ %>
		        			<!-- 다음 페이징바[>] -->
		        			<li>
		        				<a class="page-link" href="<%=request.getContextPath()%>/board/list.do?type=<%=boardType%>&cp=<%=next%>">&gt;</a>
		        			</li>
		        			
		        			<!-- 마지막 페이지로 이동[>>] -->
		        			<li>
		        				<a class="page-link" href="<%=request.getContextPath()%>/board/list.do?type=<%=boardType%>&cp=<%=maxPage%>">&gt;&gt;</a>
		        			</li>
		        		<% } %>
	        	</ul>
	        
	        </div>
	        
	        
	        
	        <!-- 검색 -->
	        <div>
	            <form action="search" method="GET" class="text-center" id="searchForm">
	                <select name="searchKey" class="form-control" style="width:100px; display: inline-block;">
	                    <!-- <option value="title" selected>글제목</option> -->
	                    <option value="title">글제목</option>
	                    <option value="content">내용</option>
	                    <option value="titcont">제목+내용</option>
	                </select>
	                <input type="text" name="searchValue" class="form-control" style="width:25%; display: inline-block;">
	                <button class="form-control btn btn-primary" style="width:100px; display: inline-block;">검색</button>
	            </form>
	            
	        </div>
    	</div>
		<%@ include file="../common/footer.jsp"%>
	</div>
	
	<script>
		//------------------------------------------------------------------------------------------------------------
		// 게시글 상세보기 기능 (jquery를 통해 작업)
		$("#list-table td").on("click", function(){
			var boardNo = $(this).parent().children().eq(0).text();
			
			location.href = "<%=request.getContextPath()%>/board/view.do?type=<%=boardType%>&cp=<%=currentPage%>&no=" + boardNo;
		}).on("mouseenter", function(){
			$(this).parent().css("cursor", "pointer");
		});
		
		;
		
		//------------------------------------------------------------------------------------------------------------
		// 검색
		
	</script>
	
	
	
</body>
</html>
