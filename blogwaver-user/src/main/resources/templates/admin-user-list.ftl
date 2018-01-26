<#import "common/admin-common.ftl" as common>
<#import "common/resource-import.ftl" as res>

<@common.content>
<@res.cssRef url="/libs/AdminLTE/plugins/iCheck/flat/blue.css"/>
<@res.cssRef url="/libs/AdminLTE/bower_components/datatables.net-bs/css/dataTables.bootstrap.css"/>
<!--header-->
<section class="content-header">
    <h1>
        <@spring.message code="user.list.tittle"/>
        <small>管理所有用户信息</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Users</a></li>
        <li class="active">List</li>
    </ol>
</section>

<#--main-->
<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-header with-border">
                    <#--<h3 class="box-title"><@spring.message code="user.list"/></h3>-->
                    <div class="box-tools pull-right">
                        <div class="has-feedback">
                            <input type="text" class="form-control input-sm global_filter" id="global_filter" placeholder=<@spring.message code="user.searchuser"/>>
                            <span class="glyphicon glyphicon-search form-control-feedback"></span>
                        </div>
                    </div>
                </div>


                <div class="mailbox-controls">
                    <!-- Check all button -->
                    <button type="button" class="btn btn-default btn-sm checkbox-toggle"><i
                            class="fa fa-square-o"></i>
                    </button>
                    <div class="btn-group">
                        <button type="button" class="btn btn-default btn-sm"><i class="fa fa-trash-o"></i>
                        </button>
                        <button type="button" class="btn btn-default btn-sm"><i class="fa fa-reply"></i>
                        </button>
                        <button type="button" class="btn btn-default btn-sm"><i class="fa fa-share"></i>
                        </button>
                    </div>
                    <!-- /.btn-group -->
                    <#--<button type="button" class="btn btn-default btn-sm"><i class="fa fa-refresh"></i></button>-->
                    <#--<a href="${basePath}/admin/sitemail/compose" class="btn btn-primary" style="height: 30px;"><i class="fa fa-pencil"></i></a>-->
                </div>
                <div class="box-body mailbox-messages table-responsive">
                    <table id="inbox-table" class="table table-bordered table-striped">
                        <thead>
                        <tr>
                            <th></th>
                            <th><@spring.message code="user.username"/></th>
                            <th><@spring.message code="user.userstatus"/></th>
                            <th><@spring.message code="user.useremail"/></th>
                            <th><@spring.message code="user.list.toolbar"/></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td><input type="checkbox"/></td>
                            <td><a href="#">admin</a></td>
                            <td><a href="#">Super Administist</a></a></td>
                            <td><a href="#">admin@javacodes.cn</a></td>
                            <td><div class="btn-group">
                                <button type="button" class="btn btn-default">查看</button>
                                <button type="button" class="btn btn-info">修改</button>
                                <button type="button" class="btn btn-danger">删除</button>
                            </div></td>
                        </tr>


                        </tbody>
                    </table>
                </div>
                <!-- /.mail-box-messages -->

            </div>

            <#--box-header-->

        </div>
    </div>

</section>


</@common.content>