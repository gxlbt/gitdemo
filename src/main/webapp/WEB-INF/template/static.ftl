<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
描述:${description}<br/>
集合大小:${nameList?size}<br/>
迭代集合:<br/>
<#list nameList as names>
这是第${names_index+1}个人，叫做：<label style="color:red">${names}</label>
if判断：<br/>
<#if (names == "陈靖仇")>
    他的武器是：十五
<#elseif (names == "宇文拓")>
    他的武器是：轩辕剑
<#else>
    她的绝招是：蛊毒
</#if>
<br/>
</#list>
迭代map集合：<br/>
<#list weaponMap?keys as key>
    key--->${key}<br/>
    value--->${weaponMap[key]!("null")}
</#list>
</body>
</html>