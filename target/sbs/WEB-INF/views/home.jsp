<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<h2>Test Suites</h2>
<p>The .table-responsive class creates a responsive table which will
	scroll horizontally on small devices (under 768px). When viewing on
	anything larger than 768px wide, there is no difference:</p>
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