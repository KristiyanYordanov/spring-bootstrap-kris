<div class="container">
	<a class="modalButton" data-toggle="modal"
		data-src="http://www.youtube.com/embed/Oc8sWN_jNF4?rel=0&wmode=transparent&fs=0"
		data-height=320 data-width=450 data-target="#myModal">Click me</a>

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
<javascript> $('a.modalButton').on('click', function(e) {
var src = $(this).attr('data-src'); var height =
$(this).attr('data-height') || 300; var width =
$(this).attr('data-width') || 400; $("#myModal iframe").attr({'src':src,
'height': height, 'width': width}); }); </javascript>