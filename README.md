项目里有两大块内容，product是商城的前台模块，admin 是后台模块。登陆注册这部分做的很详细，注册必须是用户名/密码的正确形式，
然后再存到数据库中。登陆时从数据库里检索，如果有该用户，则 允许登陆，没有则回到注册页面进行注册。
前后台分别做了登陆注册功能。后台有管理员对商品/商品类型/普通用户/订单的增删改功能。我把page单独写成了一个类，写了page的controller层，
然后在页面上调用分页技术，实现分页功能。前台有用户对商品的浏览以及添加购物车的功能，在购物车里用户可以对订单进行修改操作，最后提交订单进行购买。
 

11/22：登陆写好   
/*书写10个表的关系配置

用户的登陆表（用户账号密码）
用户的信息表（其他信息）

角色表（与用户关系：一对多）

角色权限表

权限表*/
Bonecp下载jar包是release.jar

11/27
查询，分页，带着查询条件
缓存技术ehcache、memcache、Redis
网页静态化

12/4 购物车
User
Product
Cart
CartItem
Order   与user单向的多对一
OrderDetail   与produce
负载均衡
Nginx服务器

