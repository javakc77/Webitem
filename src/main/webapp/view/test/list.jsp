<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>cccccccccccc承运商管理页面</title>
		<%@ include file="../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">
				<div class="col-sm-12">
					<!-- ------------按钮组 start------------ -->
					<div style="border: #9b9b9b">
						<div class="alert alert-success" role="alert">zzzzzzzzz承运商管理详细信息</div>
						<div class="col-sm-3">
							<div class="btn-group hidden-xs" role="group">
								<button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="test/create.jsp">
									<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
								</button>
								<button type="button" class="btn btn-success" data-toggle="modal" id="update" name="test/view.do">
									<i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
								</button>
								<button type="button" class="btn btn-default" data-toggle="modal" id="delete" name="test/delete.do">
								<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
								</button>
							 </div>
						</div>

						<div class="col-sm-9" style="display: flex">
							<div style="display: flex">
								<span style="margin-top:8px;font-size: medium" >承运商名称:</span>
								<div><input class="form-control" type="text" name="testName" value="${textEntity.testName }" placeholder="输入承运商名称"/></div>
							</div>
							<div style="display: flex;margin-right:50px">
								<span style="margin-top:8px;font-size: medium" >承运商联系人:</span>
								<div><input class="form-control" type="text" name="testName" value="${textEntity.testName }" placeholder="输入承运商联系人"/></div>
								<div><button type="button" class="btn btn-warning" id="search" name="testName" value="${textEntity.testName }">查询</button></div>
								<div><button type="reset" class="btn btn-danger" >重置</button></div>
							</div>
						</div>
					</div>
	                 <!-- ------------按钮组 end------------ -->

						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>
					                <th><input type="checkbox" id="checkall"/></th>
									<th>承运商编号</th>
									<th>承运商名称</th>
									<th>承运商联系人</th>
									<th>承运商联系电话</th>
									<th>地址</th>
									<th>负责业务范围</th>
									<th>创建时间</th>
									<th>备注</th>
									<th>操作</th>
					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list }" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${e.testId }"/></td>
						                <td>${e.testName }</td>
						                <td><javakc:show value="${e.testSex }" codeTp="sex"></javakc:show></td>
						                <td>${e.testDate }</td>
						            </tr>
					            </c:forEach>
					        </tbody>
					    </table>
				    <div class="page">${page}</div>
			     </div>
			     </form>
			</div>
		</div>
	</body>
</html>