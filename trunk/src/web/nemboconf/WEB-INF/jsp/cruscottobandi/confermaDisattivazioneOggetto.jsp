<%@taglib prefix="b" uri="/WEB-INF/bootstrap.tld"%>
<%@taglib prefix="m" uri="/WEB-INF/mybootstrap.tld"%>
<b:error />
<form id="reloadForm" name="reloadForm" target="_top" method="GET" action="../cruscottobandi/attivazione.do"
	style="position: absolute; left: -1000px; clip: rect(0px, 0px, 0px, 0px)">
	window.location.hash
</form>
<form action="confermadisattivazione_${idBandoOggetto}.do" method="post" class="form-horizontal" id="confermaEliminaForm" style="margin-top: 1em" enctype="multipart/form-data" target="hiddenIFrame" >
	${message}
	<div style="padding-top: 2em;">
	<m:textarea name="note" id="note" label = "Motivazione disattivazione: *" 
	placeholder="Inserire il motivo della disattivazione (max 4000 caratteri)"
	preferRequestValues="preferRequest"></m:textarea></div>
	<input type="hidden" id="idBandoOggetto" value="${idBandoOggetto}">
	<div class="form-group puls-group" style="margin-top: 1.5em">
		<div class="col-sm-12">
			<button type="button" data-dismiss="modal" class="btn btn-default">annulla</button>
			<button type="submit" name="conferma" id="conferma" class="btn btn-primary pull-right">conferma</button>
		</div>
	</div>
	<iframe id="iframeUpload" style="position: absolute; left: -1000px; clip: rect(0px, 0px, 0px, 0px)" name="hiddenIFrame"></iframe>
	<script type="text/javascript">
		var first = true;
		function updateModalWindow() {
			debugger;
			if (navigator.vendor.search("Google") < 0 && navigator.vendor.search("Apple") < 0) //controllo da fare perch� altrimenti non funziona su chrome, opera e safari al primo click, ma solo al secondo e carica due volte il file
				{
			if (first) {
				first = false;
				return;
			}
			}
			var html = document.getElementById('iframeUpload').contentWindow.document.body.innerHTML;
			if (html != null && html.indexOf('<refresh>') == 0) {
				document.reloadForm.submit();
			} else {
				if(html!="")
					$('.modal-body').html(html);
				doErrorTooltip();			}
		}
		document.getElementById('iframeUpload').onload = updateModalWindow;
	</script>
</form>