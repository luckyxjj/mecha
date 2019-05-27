$.extend({
	Upload: function(n, p) {
		function f(a) {
			return "undefined" != typeof a ? h = a : 1 == h ? !0 : h = !1
		}

		function q() {
			if("" == $(this).val()) return f(!1), !1;
			var a = $(this).val(),
				a = a ? a.substr(a.lastIndexOf(".")) : "",
				c = b.options.allowFiles;
			if(!a || c && -1 == (c.join("") + ".").indexOf(a.toLowerCase() + ".")) return f(!1), $("#" + b.options.prefix + "form")[0].reset(), k(g.fileTypeError), !1;
			f(!0);
			a = $("#" + b.options.prefix + "form");
			"function" == typeof b.options.loading && b.options.loading();
			a.submit();
			a[0].reset();
			$("#" + b.options.prefix + "iframe").on("load", r)
		}

		function r() {
			f(!1);
			try {
				var a = $("#" + b.options.prefix + "iframe"),
					c = (new Function("return " + a.contents().text()))();
				a.off();
				if("SUCCESS" != c.state) return b.options.error(c), !1;
				b.options.success(c)
			} catch(e) {
				b.options.error(e)
			}
		}

		function k(a) {
			b.options.debug && $.error(a);
			b.options.error(a)
		}
		var b = this,
			l = null,
			h = !1,
			g = null,
			m = !1;
		this.options = {
			debug: !1,
			prefix: "_upload" + $.now(),
			uploadType: "",
			filename: "upfile",
			actionUrl: "",
			allowFiles: [".png", ".jpg", ".jpeg", ".gif", ".bmp"],
			success: function() {},
			error: function() {},
			loading: null,
			languages: {
				fileTypeError: "\u6587\u4ef6\u7c7b\u578b\u9519\u8bef",
				selectorNotFound: "\u6ca1\u6709\u9009\u62e9\u5668"
			}
		};
		this.upload = function() {
			if(f() || m) return !1;
			$("#" + this.options.prefix + "fileinput").click();
			return !0
		};
		this.setActionUrl = function(a) {
			a = a || this.options.actionUrl;
			$("#" + this.options.prefix + "form").prop("action", a)
		};
		this.unUpload = function(a) {
			"undefined" == typeof a && (a = !0);
			return m = a
		};
		this.remove = function() {
			$("#" + this.options.prefix + "fileinput").off();
			$("#" + this.options.prefix + "div").remove();
			return !0
		};
		(function(a, c) {
			"undefined" == typeof a && k(g.selectorNotFound);
			l = $(a);
			0 == l.length && k(g.selectorNotFound);
			b.options = $.extend({}, b.options, c);
			g = $.extend({}, g, b.options.languages);
			var e = b.options.debug,
				e = e || !1,
				d = b.options.prefix;
			l.append('\x3cdiv id\x3d"' + d + 'div"\x3e\x3cform action\x3d"' + b.options.actionUrl + '" id\x3d"' + d + 'form" method\x3d"post" target\x3d"' + d + 'iframe" enctype\x3d"multipart/form-data"\x3e \x3cinput type\x3d"file" id\x3d"' + d + 'fileinput"accept\x3d"' + b.options.uploadType + '" name\x3d"' + b.options.filename + '"  /\x3e \x3c/form\x3e \x3ciframe id\x3d"' + d + 'iframe" name\x3d"' + d + 'iframe"\x3e\x3c/iframe\x3e\x3c/div\x3e');
			e = e ? "show" : "hide";
			$("#" + d + "div")[e]();
			$("#" + d + "fileinput").on("change", q)
		})(n, p);
		return this
	}
});