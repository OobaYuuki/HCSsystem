<%--header.jsp  社員情報管理システムログイン後共通ヘッダー--%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/common/common.jsp"%>
<!-- header要素は、ヘッダを表す -->
<header>
	<a href="Top"><img src="images/HCSLogo.png" alt="(株)HCS" id="logo" /></a>
	<small>資格保有率業界No1</small>
	<div id="logout">
		<div id="logout">
			<a href="Logout">ログアウト</a>
		</div>
		<br /><small>社員番号：${loginSession.syainNo}&nbsp;
			社員名：${loginSession.syainName}&nbsp;
			ロール：${loginSession.role}</small>
	</div>
	<h1>社員情報管理システム</h1>
</header>
<!-- nav要素はナビゲーションメニューを表す -->
<nav>
	<ul>
		<li><a href="SyainTop">社員情報管理</a></li>
		<li><a href="SikakuTop">資格情報管理</a></li>
		<li><a href="SkillTop">スキル情報管理</a></li>
		<c:if test="${RoleNames.ADMIN == loginSession.role}">
			<li><a href="RoleList">ロール情報管理</a></li>
		</c:if>
	</ul>
</nav>