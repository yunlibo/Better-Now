<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
<div class="container">
	<div class="tabbable">
		<ul class="nav nav-tabs">
			<li class="active"><a href="#tab-borrower" data-toggle="tab">借阅者管理</a></li>
			<%-- <li><a href="${basePath}book/book.do">图书管理</a></li>
			<li><a href="${basePath}borrow/borrow.do">借阅管理</a></li>
			<li><a href="${basePath }type/borrowerType.do">借阅者类别管理</a></li>
			<li><a href="${basePath }type/bookType.do">图书类别管理</a></li> --%>
			<%-- <li><a href="${basePath }user/manageUser.do">管理员管理</a></li> --%>
		</ul>
	</div>
	<!-- tab-panes -->
	<div class="tab-content">
		<div class="tab-pane active" id="tab1">
			<%@ include file="../borrower/borrower.jsp" %>
		</div>
		
		<div class="tab-pane" id="tab-borrow">
			<p>借阅管理</p>
		</div>
		
	</div>
</div>
<script>
		$.post(baseUrl +'borrower/getBorrowerType.do',
				{},
				function(data) {
					$(".borrower-select").empty();
					for(var i in data) {
						var option = "<option value='" + data[i]['type'] + "'>" + data[i]['type'] + "</option>";
						$(".borrower-select").append(option);
					}
				}, 
				'json');
</script>
<%@ include file="../footer.jsp" %>
