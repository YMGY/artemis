<#macro page>
<html>
    <head>
        <#include "../common/include.ftl"/>
    </head>
    <body>
        <div id="wrap">
            <#include "../common/login-menubar.ftl"/>
            <!-- Content starts -->
            <#nested>
            <!-- Content ends -->
        </div>
    </body>
</html>
</#macro>

