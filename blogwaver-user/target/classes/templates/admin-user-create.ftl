<#import "common/admin-common.ftl" as common>
<#import "common/resource-import.ftl" as res>

<@common.content>
    <@res.cssRef url="/libs/AdminLTE/plugins/iCheck/flat/blue.css"/>
    <@res.cssRef url="/libs/AdminLTE/bower_components/datatables.net-bs/css/dataTables.bootstrap.css"/>

<#--header-->
<section class="content-header" xmlns="http://www.w3.org/1999/html">
    <h1>
        <@spring.message code="user.create.tittle"/>
        <small><@spring.message code="user.create.samll"/></small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Users</a></li>
        <li class="active">Create</li>
    </ol>
</section>

<#--main-->
<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-info">

                <!-- /.box-header -->

                <form role="form">
                    <div class="box-body">
                        <!-- text input -->
                        <h3 class="box-title">账户设置</h3>
                        <br>
                        <div class="clearfix">
                            <div class="form-group">
                                <label for="username"
                                       class="col-sm-1 control-label"><@spring.message code="user.create.username"/></label>
                                <div class="col-sm-3">
                                    <input type="text" class="form-control">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="clearfix">
                            <label for="password" class="col-sm-1 control-label"><@spring.message code="user.password"/></label>
                            <div class="col-sm-3">
                                <input type="text" class="form-control">
                            </div>
                        </div>
                        <br>
                        <div class="clearfix">
                            <label for="status" class="col-sm-1 control-label"><@spring.message code="user.userstatus"/></label>
                            <div class="col-sm-3">
                                <select class="form-control">
                                    <option>管理员</option>
                                    <option>作者</option>
                                    <option>订阅用户</option>
                                    <option>其他</option>
                                </select>
                            </div>
                        </div>
                        <h3 class="box-title">个人信息</h3>
                        <br>

                        <div class="clearfix">
                            <div class="form-group">
                                <label for="firstname"
                                       class="col-sm-1 control-label"><@spring.message code="user.create.firstname"/></label>
                                <div class="col-sm-3">
                                    <input type="text" class="form-control">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="clearfix">
                            <div class="form-group">
                                <label for="lastname"
                                       class="col-sm-1 control-label"><@spring.message code="user.create.lastname"/></label>
                                <div class="col-sm-3">
                                    <input type="text" class="form-control">
                                </div>
                            </div>
                        </div>
                        <br>
                            <div class="clearfix">
                                <div class="form-group">
                                    <label for="nickname"
                                           class="col-sm-1 control-label"><@spring.message code="user.create.nickname"/></label>
                                    <div class="col-sm-3">
                                        <input type="text" class="form-control">
                                    </div>
                                </div>
                            </div>
                        <br>
                            <div class="clearfix">
                                <div class="form-group">
                                    <label for="email"
                                           class="col-sm-1 control-label"><@spring.message code="user.useremail"/></label>
                                    <div class="col-sm-3">
                                        <input type="email" class="form-control">
                                    </div>
                                </div>
                            </div>
                            <h3 class="box-title"><@spring.message code="user.create.personaldata"/></h3>
                        <br>
                            <!-- textarea -->
                            <div class="clearfix">
                                <div class="form-group">
                                    <label for="intro"
                                           class="col-sm-1 control-label"><@spring.message code="user.create.intro"/></label>
                                    <div class="col-sm-3">
                                        <textarea class="form-control" id="editor1" name="editor1" rows="10"
                                                  cols="80"></textarea>
                                    </div>
                                </div>
                            </div>
                        <br>
                            <div class="clearfix">
                                <div class="form-group">
                                    <label for="inc" class="col-sm-1"><@spring.message code="user.create.inc"/></label>
                                    <input type="file" id="exampleInputFile">
                                    <p class="help-block"></p>
                                </div>
                            </div>
                        </div>
                    <br>
                    <div class="clearfix">
                        <div class="col-sm-1">
                        <button type="button" class="btn btn-block btn-success btn-lg"><@spring.message code="user.save"/></button>
                        </div>
                    </div>
                    <br>
                    <br>

                </form>
            </div>
            <!-- /.box-body -->
        </div>
        <!-- /.box -->


    </div>
    <!-- /.col-->
    </div>
    <!-- ./row -->
</section>
</@common.content>