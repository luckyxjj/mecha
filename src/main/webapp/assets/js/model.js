(function($){
    $.fn.extend({
        /**/
        "dialog":function(options){

            if(typeof(options)=="object"){
                var template='<form class="modal fade">\
                <div class="modal-dialog">\
                <div class="modal-content">\
                <div class="modal-header">\
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>\
            <h4 class="modal-title"></h4>\
            </div>\
            <div class="modal-body">\
               <div id="tree"></div>\
               \
            </div>\
            <div class="modal-footer">\
              <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>\
                <button type="button" class="btn btn-primary">确定</button>\
                </div>\
                </div>\
            </div>\
            </form>';

                var opts={
                    title:"&nbsp;",
                    btnBind:null
                };
                for(var prop in opts){
                    opts[prop]=options[prop]||opts[prop];
                }
                var $modal=$(template);
                $modal.find(".modal-title").html(opts.title);
                // $modal.find(".modal-body").append(opts.els);
                $modal.find(".modal-body").append(this);

                $modal.find(":button:last").html(opts.btnName);
                $modal.find(":button:last").off("click").on("click",opts.btnBind);
                $modal.appendTo("body");
            }else if("open"==options){
                this.parents(".modal").modal("show");
            }else if("close"==options){
                this.parents(".modal").modal("hide");
            }
            /*$.ajax({
                type:
                    "get",
                url:
                "/shoppingType/one",
                async:
                    true,
                cache:
                    false,
                dataType:"json",
                success:
                    function(result) {
                $('#tree').treeview({data: result});

            }});*/


        }
    });
    $.fn.extend({
        /**/
        "updModal":function(options){

            if(typeof(options)=="object"){
                var template='<div class="modal fade">\
                <div class="modal-dialog">\
                <form class="modal-content">\
                <div class="modal-header">\
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>\
            <h4 class="modal-title"></h4>\
            </div>\
            <div class="modal-body">\
               <div id="tree"></div>\
               \
            </div>\
            <div class="modal-footer">\
              <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>\
                <button type="button" class="btn btn-primary">确定</button>\
                </div>\
                </form>\
            </div>\
            </div>';

                var opts={
                    title:"&nbsp;",
                    btnBind:null
                };
                for(var prop in opts){
                    opts[prop]=options[prop]||opts[prop];
                }
                var $modal=$(template);
                $modal.find(".modal-title").html(opts.title);
                $modal.find(".modal-body").append($(this).css({display:"block"}));
                $modal.find(":button:last").html(opts.btnName);
                $modal.find(":button:last").off("click").on("click",opts.btnBind);
                $modal.appendTo("body");
            }else if("open"==options){
                this.parents(".modal").modal("show");
            }else if("close"==options){
                this.parents(".modal").modal("hide");
            }

        }
    });


})(jQuery);
