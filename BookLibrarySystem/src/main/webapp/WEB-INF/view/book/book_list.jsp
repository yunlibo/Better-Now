<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ include file="../header.jsp"%>
<div class="container">
	<form class="form-search book-form-search" action="searchBookUser.do"
		method="POST">
		<input type="hidden" name="page" class="page">
		<input type="text" class="input-large book-number" placeholder="书名" name="name" value="${searchName }"> 
		<select class="span2 book-type-select" name="type"></select> 
		<button id="search-book" class="btn">搜索</button>
	</form>
	<h1>搜索结果<small>${searchName } <span class="search-type">${searchType}</span> ${pagination.items}条记录</small></h1>
	<hr>
	
	<%@ include file="./list.jsp" %>
	<%@ include file="../pagination.jsp" %>
</div>
<script>
	function pageClick(page) {
		$(".page").val(page);
		$(".book-form-search").submit();
	}
	$(document).ready(function(){
		$.each($(".book-image"), function(i,x) {
			$.post(baseUrl + "book/getBookImage.do",{id:x.name},function(data){
				x.src = data.images.large;
			},'json');
		});
		var $container = $('#masonry');
		// initialize
		$container.masonry({
		  itemSelector: '.item',
		  isAnimated: true
		});
		$.post(baseUrl +"book/getBookTypes.do",{},function(data) {
			$('.book-type-select').empty();
			$(".book-type-select").append("<option value=''>全部</option>");
			for(var i in data) {
				type = $(".search-type").html();
				var option;
				if (type == data[i]['type']) {
					option = "<option selected value='" + data[i]['type'] + "'>" + data[i]['type'] + "</option>";
				} else {
					option = "<option value='" + data[i]['type'] + "'>" + data[i]['type'] + "</option>";
				}
				$(".book-type-select").append(option);
			}
		}, 'json');
	});
	
	
</script>

<%@ include file="../footer.jsp"%>