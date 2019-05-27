$(function(){
    $('.sub').on('click',function(){
        $(".talk").show();
        $(".mask").show();
    })
    $('.confirm-btn').on('click',function(){
        $(".talk").show();
        $(".mask").show();
    })
    $('.k-li p').on('click',function(){
        var index = $(this).parent().index();
        var index = $('.k-li p').index($(this));
        $('.img-show-center').css('display','none');
        $('.img-show-center').eq(index).css('display','block');
        $(".k-li em").hide();
        $(".k-li").eq(index).children("em").show();
    })
    $($('#minClick').click());
})
