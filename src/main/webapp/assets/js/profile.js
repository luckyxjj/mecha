//
function logout() {

	var r = confirm("是否退出");
	if(r == true) {
		$.get("../admin/logout",
			function(res) {
				console.log(res.data)
				if(res.code == 0) {
				
					window.location.href = "../../manager_login.html"
				} else {

				}
			}
		);
		console.log("退出");
	}

};

//
//$(function(){ 
//　　$("#u-info").click(function(){ 
//　　　$.ajax({
//			type: "POST",
//			url: "../admin/showporfile",
//			data: "oldPasswordLogin=" + olpassword + "&newPasswordLogin=" + password,
//			async: false,
//			success: function(res) {
//				if(res.code == 0) {
//					$("#u-info").html(res.data.userName);
//				}
//				 else {
//					//alert(res.msg);
//				}
//			}
//		});
//　　}); 
//}); 

//$(document).ready(function() {　　　　
//
//	$("#u-info").click(function() {
//
//		$.ajax({
//			type: "POST",
//			url: "../admin/showporfile",
//			data: "oldPasswordLogin=" + olpassword + "&newPasswordLogin=" + password,
//			async: false,
//			success: function(res) {
//				if(res.code == 0) {
//					$("#u-info").html(res.data.userName);
//				}
//				 else {
//					//alert(res.msg);
//				}
//			}
//		});
//
//	});
//
//});