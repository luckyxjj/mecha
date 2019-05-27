function logout() {
    var r = confirm("是否退出");
    if (r == true) {
        $.get("adminBK/logout",
            function (res) {
                if (res.code == 0) {
                    window.location.href = "login-bk.html"
                } else {

                }
            }
        );
    }

};


window.onload = function () {
    $(document).ready(function () {
        $.get("adminBK/checkLoginBack",
            function (res) {
             if (res.code == 0) {
                } else {
                    window.location.href = "login-bk.html"
                }
            }
        );
    });
};

function fmtShow(value) {
    if (value == 1) {
        return "启用";
    } else if (value == 0) {
        return "不启用";
    }
}

function fmtusing(value) {
    if (value == 1) {
        return "启用";
    } else if (value == 0) {
        return "不启用";
    }
}

function fmtpower(value) {
    if (value == 2) {
        return "普通管理";
    } else if (value == 1) {
        return "管理员";
    }
}

var baseUrl = 'http://xcx.joyace.cn/source/';

//转换成图片形式显示
function formatImg(value, row, index) {
    if (value) {
        return "<a href='" + baseUrl + value + "' target='_blank'><img src='" + baseUrl+ value + "' style='width: 60px;height: 60px;padding: 5px 10px;'/></a>";
        /*这儿的value是一个图片的链接*/
    }
}

function formatImgs(value, row, index) {
    if (value) {
        return "<a href='"+ value + "' target='_blank'><img src='" + value + "' style='width: 60px;height: 60px;padding: 5px 10px;'/></a>";
        /*这儿的value是一个图片的链接*/
    }
}