$(document).ready(function() {
	EditRiderelegant(update_id);
	$("#up_button").click(myupload);
});

function myupload(){
	
	upload_callback($("#photo_form"),uploadsuccess);
	
}

var photo;

function uploadsuccess(data){
//	alert("####"+data);
	//将上传函数返回的数据传给全局变量
	photo = data;
	//alert(photo);
	//$("#up_button").hide();
//	$("img").remove();
//	$("#up_button").append("<img src='"+httpFileBasePath+photo+"'  width='100' heigh='100'/>");
	//alert(httpFileBasePath+photo);
	$("#photo").attr('src',httpFileBasePath+photo); 
}


function EditRiderelegant(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/Riderelegant_Manager_Controller_4W/queryBy_t_u_rider.action",
				data : obj,
				success : show_edit_riderelegant
			});
}

function show_edit_riderelegant(data){
	var d =$(data)[0];
	$("#name").val(d.name);
	$("#show_order").val(d.show_order);
	$("#link_pic").val(d.link_pic);
//	$("#is_show").val(d.is_show);
	/*if(d.is_show=='01'){
		$("#is_show").val("显示");
	}else{
		$("#is_show").val("隐藏");
	}
//	$("#is_show_link").val(d.is_show_link);
	if(d.is_show_link=='01'){
		$("#is_show_link").val("显示链接");
	}else{
		$("#is_show_link").val("隐藏链接");
	}
//	$("#is_excellent").val(d.is_excellent);
	if(d.is_excellent=='01'){
		$("#is_excellent").val("优秀员工");
	}else{
		$("#is_excellent").val("非优秀员工");
	}*/
	$("#photo").val(d.photo_url);
	photo=d.photo_url;
	$("#photo").attr('src',httpFileBasePath+photo); 
//	alert(photo);
}
