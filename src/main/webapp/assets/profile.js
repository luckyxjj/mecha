function logout() {
    var r = confirm("是否退出");
    if (r == true) {
        $.get("adminBk/logout",
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
        $.get("adminBk/checkLoginBack",
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
        return "关闭";
    }
}

function fmtpower(value) {
    if (value == 2) {
        return "普通管理";
    } else if (value == 1) {
        return "管理员";
    }
}

function sexFormatter(value) {
    if (value == 0) {
        return "男";
    } else if (value == 1) {
        return "女";
    }
}

function fmtBanner(value) {
    if (value == 1) {
        return "首页";
    } else if (value == 2) {
        return "关于我们";
    }else if (value == 3) {
        return "事业内容架构";
    }else if (value == 4) {
        return "买机甲";
    }else if (value == 5) {
        return "卖机甲";
    }else if (value == 6) {
        return "商城入口";
    }else if (value == 7) {
        return "创客达人招募";
    }else if (value == 8) {
        return "服务保障";
    }else if (value == 9) {
        return "咨询服务";
    }
}

function timestampToTime(timestamp) {
    var date = new Date(timestamp * 1000);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
    var Y = date.getFullYear() + '-';
    var M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    var D = (date.getDate() < 10 ? '0'+date.getDate():date.getDate())+ ' ';
    var h = (date.getHours()< 10 ? '0'+date.getHours():date.getHours()) + ':';
    var m = date.getMinutes()< 10 ? '0'+date.getMinutes():date.getMinutes();
    return Y+M+D+h+m;
}

var baseUrl = 'http://mech-chain.com/';

function timeFormatter(value) {
    var dateStr = null;
    if (value!=null){
        dateStr = timestampToTime(value/1000);
    }
    return dateStr;
}

//转换成图片形式显示
function formatImg(value, row, index) {
    if (value) {
        return "<a href='" + baseUrl + value + "' target='_blank'><img src='" + baseUrl+ value + "' style='width: 120px;height: 60px;padding: 5px 10px;'/></a>";
        /*这儿的value是一个图片的链接*/
    }
}

function formatImgs(value, row, index) {
    if (value) {
        return "<a href='"+ value + "' target='_blank'><img src='" + value + "' style='width: 60px;height: 60px;padding: 5px 10px;'/></a>";
        /*这儿的value是一个图片的链接*/
    }
}