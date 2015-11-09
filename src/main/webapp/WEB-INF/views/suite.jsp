<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="row">
	<div class="col-md-2">

		<ul class="nav nav-list">
			<li><a
				href="https://github.com/SpringSource/spring-mvc-showcase/blob/master/MasteringSpringMVC3.pdf"
				target="_blank">Back to Dashboard</a></li>
			<li><a href="http://getbootstrap.com/getting-started/"
				target="_blank">Execute Now</a></li>
			<li><a
				href="http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/spring-web.html"
				target="_blank">Delete</a></li>
			<li><a
				href="https://src.springframework.org/svn/spring-samples/"
				target="_blank">Configure</a></li>
			<li><a href="http://wrapbootstrap.com/" target="_blank">Executor
					history</a></li>
		</ul>

		<ul class="nav nav-list">
			<li>History 1</li>
			<li><div class="progress">
					<div class="progress-bar" role="progressbar" aria-valuenow="70"
						aria-valuemin="0" aria-valuemax="100" style="width: 70%">
						<span class="sr-only">70% Complete</span>
					</div>
				</div></li>

			<li>History 2</li>
			<li><div class="progress">
					<div class="progress-bar" role="progressbar" aria-valuenow="100"
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
					<tr class="modalButton" data-toggle="modal"
						data-src="http://www.youtube.com/embed/Oc8sWN_jNF4?rel=0&wmode=transparent&fs=0"
						data-height=320 data-width=450 data-target="#myModal">
						
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

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">
					<iframe frameborder="0"></iframe>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
</div>

