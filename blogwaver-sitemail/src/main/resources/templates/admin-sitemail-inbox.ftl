<#import "common/admin-common.ftl" as common>
<@common.content>
<link rel="stylesheet" type="text/css" href="${basePath}${urls.getForLookupPath("/libs/AdminLTE/plugins/iCheck/flat/blue.css")}"/>
<!-- Main content -->
<section class="content">
    <div class="row">
        <!-- /.col -->
        <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title"><@spring.message code="sitemail.inbox"/></h3>

                    <div class="box-tools pull-right">
                        <div class="has-feedback">
                            <input type="text" class="form-control input-sm" placeholder=<@spring.message code="sitemail.searchmail"/>>
                            <span class="glyphicon glyphicon-search form-control-feedback"></span>
                        </div>
                    </div>
                    <!-- /.box-tools -->
                </div>
                <!-- /.box-header -->
                <div class="box-body no-padding">
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
                        <button type="button" class="btn btn-default btn-sm"><i class="fa fa-refresh"></i></button>
                        <a href="${basePath}/admin/sitemail/compose" class="btn btn-primary" style="height: 30px;"><@spring.message code="sitemail.compose"/></a>
                        <div class="pull-right">
                            1-50/200
                            <div class="btn-group">
                                <button type="button" class="btn btn-default btn-sm"><i
                                        class="fa fa-chevron-left"></i></button>
                                <button type="button" class="btn btn-default btn-sm"><i
                                        class="fa fa-chevron-right"></i></button>
                            </div>
                            <!-- /.btn-group -->
                        </div>
                        <!-- /.pull-right -->
                    </div>
                    <div class="table-responsive mailbox-messages">
                        <table class="table table-hover table-striped">
                            <tbody>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"></td>
                                <td class="mailbox-date">5 mins ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"><i class="fa fa-paperclip"></i></td>
                                <td class="mailbox-date">28 mins ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"><i class="fa fa-paperclip"></i></td>
                                <td class="mailbox-date">11 hours ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"></td>
                                <td class="mailbox-date">15 hours ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"><i class="fa fa-paperclip"></i></td>
                                <td class="mailbox-date">Yesterday</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"><i class="fa fa-paperclip"></i></td>
                                <td class="mailbox-date">2 days ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"><i class="fa fa-paperclip"></i></td>
                                <td class="mailbox-date">2 days ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"></td>
                                <td class="mailbox-date">2 days ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"></td>
                                <td class="mailbox-date">2 days ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"></td>
                                <td class="mailbox-date">2 days ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"><i class="fa fa-paperclip"></i></td>
                                <td class="mailbox-date">4 days ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"></td>
                                <td class="mailbox-date">12 days ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"><i class="fa fa-paperclip"></i></td>
                                <td class="mailbox-date">12 days ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"><i class="fa fa-paperclip"></i></td>
                                <td class="mailbox-date">14 days ago</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td class="mailbox-name"><a href="read-mail.html">Alexander Pierce</a></td>
                                <td class="mailbox-subject"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to
                                    this problem...
                                </td>
                                <td class="mailbox-attachment"><i class="fa fa-paperclip"></i></td>
                                <td class="mailbox-date">15 days ago</td>
                            </tr>
                            </tbody>
                        </table>
                        <!-- /.table -->
                    </div>
                    <!-- /.mail-box-messages -->
                </div>
                <!-- /.box-body -->
                <div class="box-footer no-padding">
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
                        <button type="button" class="btn btn-default btn-sm"><i class="fa fa-refresh"></i></button>
                        <div class="pull-right">
                            1-50/200
                            <div class="btn-group">
                                <button type="button" class="btn btn-default btn-sm"><i
                                        class="fa fa-chevron-left"></i></button>
                                <button type="button" class="btn btn-default btn-sm"><i
                                        class="fa fa-chevron-right"></i></button>
                            </div>
                            <!-- /.btn-group -->
                        </div>
                        <!-- /.pull-right -->
                    </div>
                </div>
            </div>
            <!-- /. box -->
        </div>
        <!-- /.col -->
    </div>
    <!-- /.row -->
</section>
<!-- /.Main content -->
<script src="${basePath}${urls.getForLookupPath("/libs/AdminLTE/plugins/iCheck/icheck.js")}"></script>
<script>
    $(function () {
        //Enable iCheck plugin for checkboxes
        //iCheck for checkbox and radio inputs
        $('.mailbox-messages input[type="checkbox"]').iCheck({
            checkboxClass: 'icheckbox_flat-blue',
            radioClass: 'iradio_flat-blue'
        });

        //Enable check and uncheck all functionality
        $(".checkbox-toggle").click(function () {
            var clicks = $(this).data('clicks');
            if (clicks) {
                //Uncheck all checkboxes
                $(".mailbox-messages input[type='checkbox']").iCheck("uncheck");
                $(".fa", this).removeClass("fa-check-square-o").addClass('fa-square-o');
            } else {
                //Check all checkboxes
                $(".mailbox-messages input[type='checkbox']").iCheck("check");
                $(".fa", this).removeClass("fa-square-o").addClass('fa-check-square-o');
            }
            $(this).data("clicks", !clicks);
        });

        //Handle starring for glyphicon and font awesome
        $(".mailbox-star").click(function (e) {
            e.preventDefault();
            //detect type
            var $this = $(this).find("a > i");
            var glyph = $this.hasClass("glyphicon");
            var fa = $this.hasClass("fa");

            //Switch states
            if (glyph) {
                $this.toggleClass("glyphicon-star");
                $this.toggleClass("glyphicon-star-empty");
            }

            if (fa) {
                $this.toggleClass("fa-star");
                $this.toggleClass("fa-star-o");
            }
        });
    });
</script>
</@common.content>