$(function () {
    $.messager.model = {
        ok:{text:"确认"},
        cancel:{text:"取消"}
    }



})


function handlerMessage(data){
    if(data.success){
        $.messager.alert("温馨提示","操作成功,2s后自动刷新")
        window.setTimeout(function () {
            window.location.reload();
        },2000)
    }else{
        $.messager.alert("温馨提示",data.msg)
    }
}