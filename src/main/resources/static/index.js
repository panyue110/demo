var menuTree;

layui.use('element', function(){
    var $ = layui.jquery,
        element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块



    var addTab = function(id,name,url){
        var tab = $("li[lay-id='"+id+"']");
        if (tab.length == 0) {
            element.tabAdd('main-tab', {
                title: name
                ,content: '<iframe src="'+url+'" frameborder="0" class="layadmin-iframe"></iframe>'
                ,id: id
            });
        }
        $("li[lay-id='"+id+"']").click();
    }
    $('#home').on('click', function(){
        $("#main-tab").find("ul .layui-this").removeClass("layui-this");
        $(this).addClass("layui-this");
    });
    //基本信息
    $('#tabUserInfo').on('click', function(){
        var id = $(this).attr("data-id");
        var name = $(this).attr("data-name");
        var url = $(this).attr("data-url");
        addTab(id,name,url);
    });

    //点击顶部菜单 加载左边菜单
    element.on('nav(top-menu)', function(elem){
        var id = elem.attr("data-id");
        loadLeftMenus(id,element);
    });
    //加载顶部菜单
    loadMenu(0,element);
    //点击左边菜单，加载内容页
    element.on('nav(left-menu)', function(elem){
        var id = elem.attr("data-id");
        var name = elem.attr("data-name");
        var url = elem.attr("data-url");
        addTab(id,name,url);
    });


    $('.site-demo-active').on('click', function(){
        var othis = $(this), type = othis.data('type');
        active[type] ? active[type].call(this, othis) : '';
    });

    //Hash地址的定位
    var layid = location.hash.replace(/^#test=/, '');
    element.tabChange('test', layid);

    element.on('tab(test)', function(elem){
        location.hash = 'test='+ $(this).attr('lay-id');
    });

});

/**
 * 查询菜单
 */
var  loadMenu = function (level,element) {
    $.ajax({
        type: "POST",
        url: "/selectMenus",
        data: {
            functionlevel : level
        },
        dataType: "json",
        async : false,
        success: function(datas){

            if (datas != null && datas != '') {
                menuTree = datas;
                //解析顶部菜单
                var html="";
                $.each(datas, function(index, data){
                     html += '<li class="layui-nav-item"><a href="javascript:; "  data-id="'+data.id+'" data-name="'+data.functionname+'" >'+data.functionname+'</a></li>'; //onclick="loadLeftMenus(\''+data.id+'\')"
                 });
                $("#top-menu").empty().html(html);
                element.render('nav', 'top-menu');
                $("#top-menu").find("li a")[0].click();
            }

        }
    });
}
/**
 * 加载左边菜单
 * @param parentId
 * @param element
 */
var loadLeftMenus = function (parentId,element) {

    for (var i = 0; i < menuTree.length ; i++) {
        var id = menuTree[i].id;
        if (parentId == id) {
            var html = "";
            $.each(menuTree[i].childList, function(index, data){

                if (data.childList) {
                    html += '<li class="layui-nav-item"><a href="javascript:;" >'+data.functionname+'</a></li>';
                    var childHtml = '<dl class="layui-nav-child">';
                     for (var i = 0;i < data.childList ; i++) {
                         childHtml+='<dd><a href="javascript:;" onclick="addTab("'+data.childList[i].id+'","'+data.childList[i].functionname+'","'+data.childList[i].functionurl+'");" >'+data.childList[i].functionname+'</a></dd>'
                     }
                    childHtml+='</dl>';
                    html+=childHtml;
                }else {
                    html += '<li  class="layui-nav-item"><a class="menu-li-a" href="javascript:;" data-id="'+data.id+'" data-name="'+data.functionname+'" data-url="'+data.functionurl+'"  >'+data.functionname+'</a></li>';
                }
            });
            $("#left-menu").empty().html(html);
            element.render('nav', 'left-menu');
        }
    }
}
