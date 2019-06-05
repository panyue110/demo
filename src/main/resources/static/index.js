var menuTree;
$(function () {

    loadMenu(0);
})
/**
 * 查询菜单
 */
var  loadMenu = function (level) {
    $.ajax({
        type: "POST",
        url: "/selectMenus",
        data: {
            functionlevel : level
        },
        dataType: "json",
        async : false,
        success: function(datas){
            console.info(datas);
            debugger;
            if (datas != null && datas != '') {
                menuTree = datas;
                //解析顶部菜单
                var html="";
                $.each(datas, function(index, data){
                     html += '<li class="layui-nav-item"><a href="javascript:; " onclick="loadLeftMenus(\''+data.id+'\')">'+data.functionname+'</a></li>';
                 });
                $("#top-menu").empty().html(html);
                $("#top-menu").find("li")[0].click();
            }

        }
    });
}
var loadLeftMenus = function (parentId) {

    for (var i = 0; i < menuTree.length ; i++) {
        var id = menuTree[i].id;
        if (parentId == id) {
            var html = "";
            $.each(menuTree[i].childList, function(index, data){
                html += '<li class="layui-nav-item"><a href="javascript:;" >'+data.functionname+'</a></li>';
                if (data.childList) {
                    var childHtml = '<dl class="layui-nav-child">';
                     for (var i = 0;i<data.childList ; i++) {
                         childHtml+='<dd><a href="javascript:;">data.childList[i].childList</a></dd>'
                     }
                    childHtml+='</dl>';
                    html+=childHtml;
                }

            });
            $("#left-menu").empty().html(html);
        }
    }

}