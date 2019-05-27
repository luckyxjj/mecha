function Cookies() {
			if ($.cookie("username")) {
				$('#username').val($.cookie("username"));
				$('#password').val($.cookie("password"));
				$("#chkRememberPwd").attr('checked', true);
			}
			$('#chkRememberPwd').click(function () {
				if (!$(this).attr('checked') == true) {
					var userName = $('#username').val();
					var pwd = $('#password').val();
					$.cookie("username", userName, {
						expires: 7
					});
					$.cookie('password', pwd, {
						expires: 7
					});
				}else{
					$("#chkRememberPwd").attr('checked', false);
					$.cookie("username", '', { expires: -1 });
        			$.cookie("password", '', { expires: -1 });
				}

			})
		}