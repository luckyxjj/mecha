if( $(window).width()<1000 ){
    $("header .phone").click(function () {
        $("header nav").stop().slideToggle();
    });
}else {
    $("header nav > div:nth-of-type(5)").hover(function () {
            $(".sNav").stop().slideToggle();
        },
        function () {
            $(".sNav").stop().slideToggle();
        },
    );
    
    $(".sNav").hover(function () {
            $(this).stop().slideToggle();
        },
        function () {
            $(this).stop().slideToggle();
        },
    );
}
