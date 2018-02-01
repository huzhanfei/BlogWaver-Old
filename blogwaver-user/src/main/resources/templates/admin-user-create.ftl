<#import "common/admin-common.ftl" as common>
<#import "common/resource-import.ftl" as res>

<@common.content>
<@res.jsRef url="/assets/js/ajaxupload.js"/>
    <#--header-->
<section class="content-header">
    <h1>
        <@spring.message code="user.list.tittle"/>
        <small>添加用户</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Users</a></li>
        <li class="active">List</li>
    </ol>
</section>

    <#--mainer-->
    <section class="content">
        <form class="form-horizontal">
        <div class="col-sm-6">
            <div class="box">
                <div class="box-info">
                    <div class="box-header with-border">
                        <h3 class="box-title">
                            <@spring.message code="user.create.acount"/>*
                        </h3>
                    </div>
                    <div class="box-body">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">
                                <@spring.message code="user.create.username"/>*
                            </label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" placeholder=" <@spring.message code="user.create.username"/>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">
                                <@spring.message code="user.password"/>*
                            </label>
                            <div class="col-sm-6">
                                <input type="password" class="form-control" placeholder="<@spring.message code="user.password"/>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">
                                <@spring.message code="user.userstatus"/>*
                            </label>
                            <div class="col-sm-3">
                                <select class="form-control">
                                    <option>管理员</option>
                                    <option>作者</option>
                                    <option>订阅者</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">
                                <@spring.message code="user.create.inc"/>
                            </label>
                            <div class="col-sm-6">
                            <input type="file" class="form-control">
                            </div>
                            <div class="media">
                                <div class="media-body">
                                    <img src="/assets/images/avatar.png" height="148px">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
        <div class="box">
            <div class="box-info">
            <div class="box-header with-border">
                <h3 class="box-title"><@spring.message code="user.create.samll"/></h3>
            </div>

                    <div class="box-body">
                        <div class="form-group">
                            <label for="nickname" class="col-sm-2 control-label">
                                <@spring.message code="user.create.nickname"/>
                            </label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" placeholder=" <@spring.message code="user.create.nickname"/>"></input>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="firstname" class="col-sm-2 control-label">
                                <@spring.message code="user.create.firstname"/>
                            </label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" placeholder=" <@spring.message code="user.create.firstname"/>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="lastname" class="col-sm-2 control-label">
                                <@spring.message code="user.create.lastname"/>
                            </label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" placeholder="<@spring.message code="user.create.lastname"/>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email" class="col-sm-2 control-label">
                                <@spring.message code="user.useremail"/>
                            </label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" placeholder="<@spring.message code="user.useremail"/>">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="introducation" class="col-sm-2 control-label">
                                <@spring.message code="user.create.intro"/>
                            </label>
                            <div class="col-sm-6">
                                <textarea class="form-control" rows="5" placeholder="<@spring.message code="user.create.intro"/>">
                                </textarea>
                            </div>
                        </div>
                    </div>

            </div>
        </div>
        </div>
        <div class="row col-sm-12">
            <div class="col-sm-1">
                <button type="submit" class="btn btn-primary">save</button>
            </div>
            <div class="col-sm-6">
                <button type="reset" class="btn btn-default">cancle</button>
            </div>
        </div>
        </form>
    </section>

<script>

</script>
</@common.content>