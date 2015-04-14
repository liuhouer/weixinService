<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<html lang="en">
	<head>
		<title>完善信息</title>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="css/colorpicker.css" />
		<link rel="stylesheet" href="css/datepicker.css" />
		<link rel="stylesheet" href="css/uniform.css" />
		<link rel="stylesheet" href="css/select2.css" />
		<link rel="stylesheet" href="css/unicorn.main.css" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	</head>
	<body>




		<div class="widget-box">
			<div class="widget-title">
				<span class="icon"> <i class="icon-align-justify"></i> </span>
				<h5>
					输入基本信息
				</h5>
			</div>
			<div class="widget-content nopadding">
				<form action="../onAddUser.action" method="post"
					class="form-horizontal" />
					<div class="control-group">
						<label class="control-label">
							姓名
						</label>
						<div class="controls">
							<input type="text" id="name" name="name" />
							<input type="hidden" id="weichatid" name="weichatid"
								value='<%=request.getParameter("weichatid")%>' />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">
							准考证号
						</label>
						<div class="controls">
							<input type="text" id="examno" name="examno" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">
							联系方式
						</label>
						<div class="controls">
							<input type="text" id="tel" name="tel" />
							<span class="help-block">请确保该号码能够联系到本人</span>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">
							总分
						</label>
						<div class="controls">
							<input type="text" id="totalscor" name="totalscor" />
						</div>
					</div>

					<div class="form-actions">
						<button type="submit" class="btn btn-primary">
							提交
						</button>
					</div>
				</form>
			</div>
		</div>



		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.ui.custom.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap-colorpicker.js"></script>
		<script src="js/bootstrap-datepicker.js"></script>
		<script src="js/jquery.uniform.js"></script>
		<script src="js/select2.min.js"></script>
		<script src="js/unicorn.js"></script>
		<script src="js/unicorn.form_common.js"> </script>
         <script type="text/javascript">
          document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
		WeixinJSBridge.call('hideOptionMenu');
		WeixinJSBridge.call('hideToolbar');
		});
         </script>    
           

	</body>
</html>
