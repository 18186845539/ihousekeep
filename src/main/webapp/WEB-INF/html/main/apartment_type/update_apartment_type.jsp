<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改户型</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/js/base_table.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/admin/page/page.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script
	src="<%=baseurl%>/html/main/apartment_type/update_apartment_type.js"></script>

</head>
<body>

	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>户型</td>
			<td><p style="float: left">
					<input id="apartment_name_t" type="text" size="2"
						class="form-control" style="float: left">
				<p style="float: left">室</p>
				
				<p style="float: left">
					<input id="apartment_name_c" type="text" size="2"
						class="form-control">
				<p style="float: left">厅</p>
				<p style="float: left">
					<input id="apartment_name_w" type="text" size="2"
						class="form-control">
				<p style="float: left">卫</p><p style="float: left">
					<input id="apartment_name_s" type="text" size="2"
						class="form-control">
				<p style="float: left">厨</p></td>
		</tr>

	</table>

</body>
</html>