
var projectName = '浙江宏森保安公司管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '业务信息',
	url: './pages/yewuxinxi/list.jsp'
}, 
{
	name: '优秀员工',
	url: './pages/youxiuyuangong/list.jsp'
}, 
{
	name: '站岗信息',
	url: './pages/zhangangxinxi/list.jsp'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspm77715/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"客户","menuJump":"列表","tableName":"kehu"}],"menu":"客户管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除","评选","考核","工资"],"menu":"安保人员","menuJump":"列表","tableName":"anbaorenyuan"}],"menu":"安保人员管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除"],"menu":"业务信息","menuJump":"列表","tableName":"yewuxinxi"}],"menu":"业务信息管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"业务类型","menuJump":"列表","tableName":"yewuleixing"}],"menu":"业务类型管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除","修改"],"menu":"优秀员工","menuJump":"列表","tableName":"youxiuyuangong"}],"menu":"优秀员工管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","删除","审核","合同"],"menu":"业务申请","menuJump":"列表","tableName":"yewushenqing"}],"menu":"业务申请管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除"],"menu":"合同信息","menuJump":"列表","tableName":"hetongxinxi"}],"menu":"合同信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"培训信息","menuJump":"列表","tableName":"peixunxinxi"}],"menu":"培训信息管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","修改","删除"],"menu":"考核信息","menuJump":"列表","tableName":"kaohexinxi"}],"menu":"考核信息管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","排班"],"menu":"岗点信息","menuJump":"列表","tableName":"gangdianxinxi"}],"menu":"岗点信息管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","修改","删除"],"menu":"站岗信息","menuJump":"列表","tableName":"zhangangxinxi"}],"menu":"站岗信息管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除"],"menu":"工资信息","menuJump":"列表","tableName":"gongzixinxi"}],"menu":"工资信息管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","申请"],"menu":"业务信息列表","menuJump":"列表","tableName":"yewuxinxi"}],"menu":"业务信息模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"优秀员工列表","menuJump":"列表","tableName":"youxiuyuangong"}],"menu":"优秀员工模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"站岗信息列表","menuJump":"列表","tableName":"zhangangxinxi"}],"menu":"站岗信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改","删除"],"menu":"业务申请","menuJump":"列表","tableName":"yewushenqing"}],"menu":"业务申请管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"合同信息","menuJump":"列表","tableName":"hetongxinxi"}],"menu":"合同信息管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","申请"],"menu":"业务信息列表","menuJump":"列表","tableName":"yewuxinxi"}],"menu":"业务信息模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"优秀员工列表","menuJump":"列表","tableName":"youxiuyuangong"}],"menu":"优秀员工模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"站岗信息列表","menuJump":"列表","tableName":"zhangangxinxi"}],"menu":"站岗信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"客户","tableName":"kehu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"培训信息","menuJump":"列表","tableName":"peixunxinxi"}],"menu":"培训信息管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"考核信息","menuJump":"列表","tableName":"kaohexinxi"}],"menu":"考核信息管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看"],"menu":"站岗信息","menuJump":"列表","tableName":"zhangangxinxi"}],"menu":"站岗信息管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看"],"menu":"工资信息","menuJump":"列表","tableName":"gongzixinxi"}],"menu":"工资信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","申请"],"menu":"业务信息列表","menuJump":"列表","tableName":"yewuxinxi"}],"menu":"业务信息模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"优秀员工列表","menuJump":"列表","tableName":"youxiuyuangong"}],"menu":"优秀员工模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"站岗信息列表","menuJump":"列表","tableName":"zhangangxinxi"}],"menu":"站岗信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"安保人员","tableName":"anbaorenyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
