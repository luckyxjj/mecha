webpackJsonp([18],[,function(a,b,c){"use strict";Object.defineProperty(b,"__esModule",{value:!0}),function(a){function c(a){var b=(a+"").split(".");return b[0]=b[0].replace(/(\d)(?=(\d{3})+$)/ig,"$1,"),b.join(".")}function d(a){return(100*a).toFixed(2)+"%"}function e(a){return a.toFixed(2)}function f(){if(s.transactionDiretion!=void 0){if("up"==s.transactionDiretion){if("america"==s.transactionType)switch(m(d(r.american1MonthUpPrice),d(r.american3MonthUpPrice),d(r.american6MonthUpPrice)),parseInt(s.transactionCycle)){case 1:a=r.american1MonthUpPrice;break;case 2:a=r.american2MonthUpPrice;break;case 3:a=r.american3MonthUpPrice;break;case 4:a=r.american4MonthUpPrice;break;case 5:a=r.american5MonthUpPrice;break;case 6:a=r.american6MonthUpPrice;break;case 7:a=r.american7MonthUpPrice;break;case 8:a=r.american8MonthUpPrice;break;case 9:a=r.american9MonthUpPrice;break;case 10:a=r.american10MonthUpPrice;break;case 11:a=r.american11MonthUpPrice;break;case 12:a=r.american12MonthUpPrice;}else switch(m(d(r.european1MonthUpPrice),d(r.european3MonthUpPrice),d(r.european6MonthUpPrice)),parseInt(s.transactionCycle)){case 1:a=r.european1MonthUpPrice;break;case 2:a=r.european2MonthUpPrice;break;case 3:a=r.european3MonthUpPrice;break;case 4:a=r.european4MonthUpPrice;break;case 5:a=r.european5MonthUpPrice;break;case 6:a=r.european6MonthUpPrice;break;case 7:a=r.european7MonthUpPrice;break;case 8:a=r.european8MonthUpPrice;break;case 9:a=r.european9MonthUpPrice;break;case 10:a=r.european10MonthUpPrice;break;case 11:a=r.european11MonthUpPrice;break;case 12:a=r.european12MonthUpPrice;}}else if("america"==s.transactionType){var a;switch(m(d(r.american1MonthDownPrice),d(r.american3MonthDownPrice),d(r.american6MonthDownPrice)),parseInt(s.transactionCycle)){case 1:a=r.american1MonthDownPrice;break;case 2:a=r.american2MonthDownPrice;break;case 3:a=r.american3MonthDownPrice;break;case 4:a=r.american4MonthDownPrice;break;case 5:a=r.american5MonthDownPrice;break;case 6:a=r.american6MonthDownPrice;break;case 7:a=r.american7MonthDownPrice;break;case 8:a=r.american8MonthDownPrice;break;case 9:a=r.american9MonthDownPrice;break;case 10:a=r.american10MonthDownPrice;break;case 11:a=r.american11MonthDownPrice;break;case 12:a=r.american12MonthDownPrice;}}else switch(m(d(r.european1MonthDownPrice),d(r.european3MonthDownPrice),d(r.european6MonthDownPrice)),parseInt(s.transactionCycle)){case 1:a=r.european1MonthDownPrice;break;case 2:a=r.european2MonthDownPrice;break;case 3:a=r.european3MonthDownPrice;break;case 4:a=r.european4MonthDownPrice;break;case 5:a=r.european5MonthDownPrice;break;case 6:a=r.european6MonthDownPrice;break;case 7:a=r.european7MonthDownPrice;break;case 8:a=r.european8MonthDownPrice;break;case 9:a=r.european9MonthDownPrice;break;case 10:a=r.european10MonthDownPrice;break;case 11:a=r.european11MonthDownPrice;break;case 12:a=r.european12MonthDownPrice;}null!=a&&(s.transactionCostRate=a,g(),h(),i(),l())}}function g(){a(".transaction_cost_rate>label").html(d(s.transactionCostRate))}function h(){a(".lever_number>label").html(e(1/s.transactionCostRate))}function i(){s.transactionCost=e(s.transactionLeverMoney*s.transactionCostRate),a(".transaction_cost>label").html(c(s.transactionCost)),l()}function j(b)
{a.ajax(
    {type:"POST",url:"../getMsg/ajaxOtcSearch",data:"keyWord="+b,
        success:function(a){r=eval('(' + a + ')'),n()}})}
        function k(b,f,g,h){a("#future_profit_"+(b+1)).find("td:first").html(d(g)),a("#future_profit_"+(b+1)).find("td:eq(1)").html(e(s.transactionPrice*f)),a("#future_profit_"+(b+1)).find("td:eq(2)").html(d(e(e(s.transactionLeverMoney*h)-s.transactionCost)/s.transactionCost)),a("#future_profit_"+(b+1)).find("td:last").html(c(e(e(s.transactionLeverMoney*h)-s.transactionCost)))}function l(){var a=0.05,b=2;if("up"==s.transactionDiretion){for(var c=0;5>c;c++)k(c,c*a+1,c*a,c*a);a=0.1;for(var c=5;8>c;c++)k(c,(c-b)*a+1,(c-b)*a,(c-b)*a)}else{for(var c=0;5>c;c++)k(c,1-c*a,-c*a,c*a);a=0.1;for(var c=5;8>c;c++)k(c,1-(c-b)*a,-(c-b)*a,(c-b)*a)}}function m(b,c,d){a("#price1").html(b),a("#price3").html(c),a("#price6").html(d)}function n(){q(),s.transactionDiretion="up",s.transactionType="america",s.transactionPrice=r.subjectPrice,s.transactionCycle=1,s.transactionLeverMoney=1e6,s.transactionCostRate=r.american1MonthUpPrice,s.transactionCost=e(s.transactionLeverMoney*s.transactionCostRate),s.tradeBackgroudColor="otc_up_background_color",m(d(r.american1MonthUpPrice),d(r.american3MonthUpPrice),d(r.american6MonthUpPrice)),a(".stock_advice").hide(),a(".transaction_direction .up").addClass(s.tradeBackgroudColor),a(".otc_type .america").addClass(s.tradeBackgroudColor),a(".transaction_price input[name='close_price']").val(r.subjectPrice),a(".excute_power_cycle .month_1").addClass(s.tradeBackgroudColor),a(".future_cash .million_1").addClass(s.tradeBackgroudColor),a("input[name='stock_code']").val(r.subjectName+" "+r.subjectCode),g(),h(),i(),l()}function o(){a.ajax({cache:!0,type:"GET",url:"http://www.chaqiquan.com/api/otcOptions/searchAdvices",data:"keyWord="+a("input[name='stock_code']").val(),async:!1,success:function(b){if(0<b.length){var c="";for(var d in b)c+="<li><a class='dropdown-item' href='javascript:void(0);' stockId="+b[d].subjectCode+"> "+b[d].subjectName+"&nbsp;"+b[d].subjectCode+"&nbsp;"+b[d].chiSpelling+"</a></li>";a(".stock_advice>ul").html(c),a(".stock_advice").show()}}})}function p(){"up"==s.transactionDiretion?a(".otc_down_background_color").addClass("otc_up_background_color").removeClass("otc_down_background_color"):a(".otc_up_background_color").addClass("otc_down_background_color").removeClass("otc_up_background_color")}function q(){"down"==s.transactionDiretion&&a(".otc_down_background_color").addClass("otc_up_background_color").removeClass("otc_down_background_color"),a(".transaction_direction>label").removeClass("otc_up_background_color"),a(".otc_type>label").removeClass("otc_up_background_color"),a(".excute_power_cycle>label").removeClass("otc_up_background_color"),a(".future_cash>label").removeClass("otc_up_background_color"),a(".future_cash>input").val("")}b.getStockInfo=j;var r,s={};a(function(){a("input[name='stock_code']").bind("input propertychange",function(){o()}),a("input[name='stock_code']").bind("keyup",function(b){if("13"==b.keyCode){var c=a(".stock_advice ul li>a:first").attr("stockid");c!=void 0&&j(c)}}),a(".transaction_direction>label").click(function(){a(".transaction_direction>label").removeClass(s.tradeBackgroudColor),s.transactionDiretion!=void 0&&(a(this).hasClass("up")?(s.tradeBackgroudColor="otc_up_background_color",s.transactionDiretion="up"):(s.tradeBackgroudColor="otc_down_background_color",s.transactionDiretion="down"),a(this).addClass(s.tradeBackgroudColor),p(),f())}),a(".otc_type>label").click(function(){s.transactionType!=void 0&&(a(".otc_type>label").removeClass(s.tradeBackgroudColor),a(this).addClass(s.tradeBackgroudColor),s.transactionType=a(this).hasClass("america")?"america":"europe",f())}),a(".transaction_price>label").click(function(){s.transactionPrice!=void 0&&(a(this).hasClass("plus")?a("input[name='close_price']").val(e(a("input[name='close_price']").val()- -0.01)):a("input[name='close_price']").val(e(a("input[name='close_price']").val()-0.01)),s.transactionPrice=a("input[name='close_price']").val(),l())}),a(".transaction_price>input").on("change",function(){s.transactionPrice=a("input[name='close_price']").val(),l()}),a(".excute_power_cycle>label").click(function(){s.transactionCycle!=void 0&&(a(".excute_power_cycle>label").removeClass(s.tradeBackgroudColor),a(this).addClass(s.tradeBackgroudColor),s.transactionCycle=a(this).attr("data"),f())}),a(".excute_power_cycle>select").on("change",function(){a(".excute_power_cycle>label").removeClass(s.tradeBackgroudColor),s.transactionCycle=a(this).val(),f()}),a(".future_cash>label").click(function(){s.transactionLeverMoney!=void 0&&(a(".future_cash>label").removeClass(s.tradeBackgroudColor),a(this).addClass(s.tradeBackgroudColor),s.transactionLeverMoney=a(this).attr("data"),i())}),a(".future_cash>input").on("change",function(){a(".future_cash>label").removeClass(s.tradeBackgroudColor),s.transactionLeverMoney=1e4*a(this).val(),i()}),a(".stock_advice ul").on("click","li a",function(){j(a(this).attr("stockId"))})})}.call(b,c(0))}],[1]);