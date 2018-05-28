<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>success!</h1>
    <form autocomplete="off" id="logonForm" name="logonForm" target="logonAppPage" method="post" action="http://10.6.1.80/irj/portal">
        <input name="login_submit" type="hidden" value="on">
        <input type="hidden" name="login_do_redirect" value="1">
        <input name="no_cert_storing" type="hidden" value="on">
        <input type="hidden" name="j_salt" value="45oURP7z2dS/dm7fzhwwVKy/wfI=">
        <table class="urLogonTable" cellspacing="3px" cellpadding="0" valign="top">
            <tbody>
                <tr>
                    <td colspan="3">
                        <div class="urMessageArea">
                            <!--	Federation Error Message				-->
                        </div>
                    </td>
                </tr>
                <!-- userid -->
                <tr>
                    <td>
                        <label class="urLblStdNew">
                            <nobr>用户<span class="urLblReq">&nbsp;*</span></nobr>
                        </label>
                    </td>
                    <td>
                        <input type="text" id="logonuidfield" name="j_username" value="" title="用户 *" class="urEdfTxtEnbl" style="width:170px">
                    </td>
                    <td width="100%">&nbsp;</td>
                </tr>
                <!-- password -->
                <tr>
                    <td>
                        <label class="urLblStdNew" for="logonpassfield">
                            <nobr>密码<span class="urLblReq">&nbsp;*</span></nobr>
                        </label>
                    </td>
                    <td>
                        <input type="password" id="logonpassfield" name="j_password" class="urEdfTxtEnbl" style="width:170px">
                    </td>
                    <td>&nbsp;</td>
                </tr>
                <!-- create certificate -->
                <!-- Federate User checkbox -->
                <tr>
                    <td width="100%" colspan="3">&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;
                    </td>
                    <td align="right">
                        <!-- logon button -->
                        <input class="urBtnStdNew" type="submit" name="uidPasswordLogon" value="登录">
                    </td>
                    <td>&nbsp;</td>
                </tr>
                <!-- link to certificate logon -->
                <!-- logon help -->
            </tbody>
        </table>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
	
$(function(){
	$.ajax({
		url:'http://10.6.1.80/irj/portal?login_submit=on&login_do_redirect=1&no_cert_storing=on&j_username=10001476&j_password=lj6281341&uidPasswordLogon=%E7%99%BB%E5%BD%95',
		// url:'http://47.93.16.119/CEMobiDemo/history/queryMyHistory.do',
		success:function(data){
			console.log(data)
		},
		dataType:'html'
		})
})

</script>
</body>
</html>