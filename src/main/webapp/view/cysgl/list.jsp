<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>aaaaaaa管理页面</title>
		<%@ include file="../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">
				<div class="col-sm-12">
					<!-- ------------按钮组 start------------ -->
					<div style="border: #9b9b9b">
						<div class="alert alert-success" role="alert">aaaaaa管理详细信息</div>
						<div class="col-sm-3">
							<div class="btn-group hidden-xs" role="group">
								<button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="Cysgl/create.jsp">
									<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
								</button>
								<button type="button" class="btn btn-success" data-toggle="modal" id="update" name="Cysgl/view.do">
									<i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
								</button>
								<button type="button" class="btn btn-default" data-toggle="modal" id="delete" name="Cysgl/delete.do">
								<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
								</button>
							 </div>
						</div>

						<div class="col-sm-9" style="display: flex">
							<div style="display: flex">
								<span style="margin-top:8px;font-size: medium" >承运商名称:</span>
								<div><input class="form-control" type="text" name="testName" value="${cysglEntity.testName }" placeholder="输入承运商名称"/></div>
							</div>
							<div style="display: flex;margin-right:50px">
								<span style="margin-top:8px;font-size: medium" >承运商联系人:</span>
								<div><input class="form-control" type="text" name="testName" value="${cysglEntity.testName }" placeholder="输入承运商联系人"/></div>
								<div><button type="button" class="btn btn-warning" id="search" name="testName" value="${cysglEntity.testName }">查询</button></div>
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
					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list }" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${e.id}"/></td>
						                <td>${e.cysglNumber}</td>
						                <td>${e.cysglName}</td>
						                <td>${e.cysglLandlines}</td>
						                <td>${e.cysglState}</td>
						                <td>${e.cysglUsername}</td>
						                <td>${e.cysglTelephone}</td>
						                <td>${e.cysglAddress}</td>
						                <td>${e.cysglRange}</td>
										<td>${e.createDate}</td>
										<td>${e.cysglRemarks}</td>

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