<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div class="row">
	<div class="col-md-2">
		<ul class="nav nav-list">
			<li><a
				href="https://github.com/SpringSource/spring-mvc-showcase/blob/master/MasteringSpringMVC3.pdf"
				target="_blank">New Test Suite</a></li>
			<li><a href="http://getbootstrap.com/getting-started/"
				target="_blank">People</a></li>
			<li><a
				href="http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/spring-web.html"
				target="_blank">History</a></li>
			<li><a
				href="https://src.springframework.org/svn/spring-samples/"
				target="_blank">Settings</a></li>
			<li><a href="http://wrapbootstrap.com/" target="_blank">Executor
					status</a></li>

		</ul>

		<ul class="nav nav-list">
			<li>Suite 1</li>
			<li><div class="progress">
					<div class="progress-bar" role="progressbar" aria-valuenow="70"
						aria-valuemin="0" aria-valuemax="100" style="width: 70%">
						<span class="sr-only">70% Complete</span>
					</div>
				</div></li>

			<li>Suite 2</li>
			<li><div class="progress">
					<div class="progress-bar" role="progressbar" aria-valuenow="20"
						aria-valuemin="0" aria-valuemax="100" style="width: 70%">
						<span class="sr-only">70% Complete</span>
					</div>
				</div></li>
		</ul>

	</div>
	<div class="col-md-10">
		<h2>Test Suites</h2>

		<div class="table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>Status</th>
						<th>Test Suite Name</th>
						<th>Last Success</th>
						<th>lastDuration</th>
						<th>Short Description</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>Anna</td>
						<td>Pitt</td>
						<td>35</td>
						<td>New York</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>