function toggleLiveResizing() {
	$.each($.layout.config.borderPanes, function(i, pane) {
		var o = astroLayout.options[pane];
		o.livePaneResizing = !o.livePaneResizing;
	});
};

function toggleStateManagement(skipAlert, mode) {
	if (!$.layout.plugins.stateManagement)
		return;

	var options = astroLayout.options.stateManagement, enabled = options.enabled // current
	// setting
	;
	if ($.type(mode) === "boolean") {
		if (enabled === mode)
			return; // already correct
		enabled = options.enabled = mode
	} else
		enabled = options.enabled = !enabled; // toggle option

	if (!enabled) { // if disabling state management...
		astroLayout.deleteCookie(); // ...clear cookie so will NOT be found on
		// next refresh
		if (!skipAlert)
			alert('This layout will reload as the options specify \nwhen the page is refreshed.');
	} else if (!skipAlert)
		alert('This layout will save & restore its last state \nwhen the page is refreshed.');

	// update text on button
	var $Btn = $('#btnToggleState'), text = $Btn.html();
	if (enabled)
		$Btn.html(text.replace(/Enable/i, "Disable"));
	else
		$Btn.html(text.replace(/Disable/i, "Enable"));
};

// set EVERY 'state' here so will undo ALL layout changes
// used by the 'Reset State' button: astroLayout.loadState( stateResetSettings )
var stateResetSettings = {
	north__size : "auto",
	north__initClosed : false,
	north__initHidden : false,
	south__size : "auto",
	south__initClosed : false,
	south__initHidden : false,
	west__size : 200,
	west__initClosed : false,
	west__initHidden : false,
	east__size : 300,
	east__initClosed : false,
	east__initHidden : false
};

var astroLayout;

$(document).ready(function() {

	// ======================================= JQUERY LAYOUT AND ACCORDIAN ==============================================//

	astroLayout = $('body').layout();
	$("#astro-accordion").accordion();
	// $("#horoscopeForm").load("astroProfile.html");
	// $("#horoscopeForm").load("a.html");
	$("#horoscopeForm").hide("scale", 500);
	/*
	 * $("#horoscopeMenu").click(function(){
	 * $("#dummyContent").hide("scale", 500);
	 * $("#pdf").hide("scale", 500);
	 * $("#horoscopeForm").show("scale", 500); })
	 */

	// if there is no state-cookie, then DISABLE state
	// management initially
	var cookieExists = !$.isEmptyObject(astroLayout
			.readCookie());
	if (!cookieExists)
		toggleStateManagement(true, false);

	astroLayout
	// add event to the 'Close' button in the East pane
	// dynamically...
	.bindButton('#btnCloseEast', 'close', 'east')

	// add event to the 'Toggle South' buttons in Center AND
	// South panes dynamically...
	.bindButton('.south-toggler', 'toggle', 'south')

	// add MULTIPLE events to the 'Open All Panes' button in the
	// Center pane dynamically...
	.bindButton('#openAllPanes', 'open', 'north').bindButton(
			'#openAllPanes', 'open', 'south').bindButton(
			'#openAllPanes', 'open', 'west').bindButton(
			'#openAllPanes', 'open', 'east')

	// add MULTIPLE events to the 'Close All Panes' button in
	// the Center pane dynamically...
	.bindButton('#closeAllPanes', 'close', 'north').bindButton(
			'#closeAllPanes', 'close', 'south').bindButton(
			'#closeAllPanes', 'close', 'west').bindButton(
			'#closeAllPanes', 'close', 'east')

	// add MULTIPLE events to the 'Toggle All Panes' button in
	// the Center pane dynamically...
	.bindButton('#toggleAllPanes', 'toggle', 'north')
			.bindButton('#toggleAllPanes', 'toggle', 'south')
			.bindButton('#toggleAllPanes', 'toggle', 'west')
			.bindButton('#toggleAllPanes', 'toggle', 'east')

	// === Custom Toggler to hide North, South & East Panes only.
	.bindButton('#toggleNSEPanes', 'toggle', 'north')
	.bindButton('#toggleNSEPanes', 'toggle', 'south')
	.bindButton('#toggleNSEPanes', 'toggle', 'east');
	
	/*
	 * DISABLE TEXT-SELECTION WHEN DRAGGING (or even _trying_ to
	 * drag!) this functionality will be included in RC30.80
	 */
	$.layout.disableTextSelection = function() {
		var $d = $(document), s = 'textSelectionDisabled', x = 'textSelectionInitialized';
		if ($.fn.disableSelection) {
			if (!$d.data(x)) // document hasn't been
				// initialized yet
				$d.on('mouseup', $.layout.enableTextSelection)
						.data(x, true);
			if (!$d.data(s))
				$d.disableSelection().data(s, true);
		}
		// console.log('$.layout.disableTextSelection');
	};
	$.layout.enableTextSelection = function() {
		var $d = $(document), s = 'textSelectionDisabled';
		if ($.fn.enableSelection && $d.data(s))
			$d.enableSelection().data(s, false);
		// console.log('$.layout.enableTextSelection');
	};
	$(".ui-layout-resizer").disableSelection() // affects only the resizer element
	.on('mousedown', $.layout.disableTextSelection); // affects entire document

	// ======================================= 
	// ASTROLOGY HOROSCOPE FORM
	// =======================================

	// include all forms in separate html files
	var includes = $('.include');
	$.each(includes, function() {
		var file = $(this).data('include') + '.html';
		$(this).load(file);
	});

	// get all shlokas
	$.ajax({
		url : "http://localhost:8080/astro/horoscope/shlokas",
		type : "GET",
		// data : postData,
		dataType : 'json', // what type of data do we expect
		// back from the server
		contentType : "application/json; charset=utf-8",
		// encode : true
		success : function(data, textStatus, jqXHR) {
			// data: return data from server
			// alert("getting all shlokas...");
			// alert("RESPONSE DATA : " + JSON.stringify(data));
			// var datax = $.parseJSON(JSON.stringify(data));
			var resultDiv = prepareDivElement(data, 'Shloka',
					'shlokaDiv', 'radio');
			$("#header").append(resultDiv);
			/*
			 * var radio = $("<input/>") .attr('type','radio')
			 * .attr("id", '1') .attr("name", "shloka")
			 * .attr("value", '1') $("#header").append(radio);
			 */

		},
		error : function(jqXHR, textStatus, exception) {
			// if fails
			// alert("astro data submition failed..." +
			// textStatus);
			// alert("status : " + jqXHR.status + " , textStatus
			// : " + jqXHR.responseText);

			if (jqXHR.status === 0) {
				alert('Not connect. Verify Network.');
			} else if (jqXHR.status == 404) {
				// alert('Requested page not found. [404]');
			} else if (jqXHR.status == 500) {
				alert('Internal Server Error [500].');
			}
			if (exception === 'parsererror') {
				alert('Requested JSON parse failed.');
			} else if (exception === 'timeout') {
				alert('Time out error.');
			} else if (exception === 'abort') {
				alert('Ajax request aborted.');
			} else {
				// alert('Uncaught Error. ' + exception + " - "
				// + jqXHR.responseText);
			}
		}
	});

	// callback handler for form submit
	$("#horoscopeForm").submit(function(e) {
		// alert("form submission started...");
		var data = {};
		/*var fields = $(this).serializeArray();
		$.each(fields, function(i, field) {
			fieldDetail = {};
			fieldDetail['name'] = field.name;
			fieldDetail['value'] = field.value;
			data[field.name] = fieldDetail;
		});*/
		//alert('data ==>> ' + JSON.stringify(data));
		
		// ==== COLLECT ALL FIELD VALUES OF EACH SECTION BY GROUP === //
		// collect all fields within god section
		var godInputs = $("#god :input");
		var godDetails = {};
		$.each(godInputs, function(i, field) {
			godDetails[field.name] = field.value;
		});
		data['god'] = godDetails;
		
		// collect all fields within reference section
		var refInputs = $("#reference :input");
		var refDetails = {};
		$.each(refInputs, function(i, field) {
			refDetails[$(field).attr('label')] = field.name;
			refDetails[field.name] = field.value;
		});
		data['reference'] = refDetails;
		
		// collect all fields within birth_details section
		var birthDetailsInputs = $("#birth_details :input");
		var birthDetails = {};
		$.each(birthDetailsInputs, function(i, field) {
			birthDetails[$(field).attr('label')] = field.name;
			birthDetails[field.name] = field.value;
		});
		data['birthDetails'] = birthDetails;
		
		var dataJsonStr = JSON.stringify(data);
		$("#data").text(dataJsonStr);
		
		// ==== END - COLLECT ALL FIELD VALUES OF EACH SECTION BY GROUP - END === //

		
		// var postData = createJSON();
		// alert("post data ==> " + postData);
		var formURL = $(this).attr("action");
		// var formURL =
		// "http://localhost:8080/horoscope/report/prepare";
		// var formURL = "/horoscope/report/prepare";
		$.ajax({
			url : formURL,
			type : "POST",
			// data : postData,
			data : dataJsonStr,
			dataType : 'json', // what type of data do we
			// expect back from the server
			contentType : "application/json; charset=utf-8",
			// encode : true
			success : function(data, textStatus, jqXHR) {
				// data: return data from server
				alert("astro data succesfully submitted...");
				// alert("RESPONSE DATA : " +
				// JSON.stringify(data));
				$("#responseData").text(JSON.stringify(data));
			},
			error : function(jqXHR, textStatus, exception) {
				// if fails
				// alert("astro data submition failed..." +
				// textStatus);
				// alert("status : " + jqXHR.status + " ,
				// textStatus : " + jqXHR.responseText);

				if (jqXHR.status === 0) {
					// alert('Not connect. Verify Network.');
				} else if (jqXHR.status == 404) {
					// alert('Requested page not found. [404]');
				} else if (jqXHR.status == 500) {
					// alert('Internal Server Error [500].');
				}
				if (exception === 'parsererror') {
					// alert('Requested JSON parse failed.');
				} else if (exception === 'timeout') {
					// alert('Time out error.');
				} else if (exception === 'abort') {
					// alert('Ajax request aborted.');
				} else {
					// alert('Uncaught Error. ' + exception + "
					// - " + jqXHR.responseText);
				}
			}
		});
		e.preventDefault(); // STOP default action
		e.unbind(); // unbind. to stop multiple form submit.
	});

	function createJSON() {
		horoscope = {};
		rashiChakra = {};

		jsonArray = [];
		jsonObj = {};
		grahaArray = [];

		$.each($("input[rashi='mesha']:checked"), function() {
			// item = {}
			// item ["graha"] = $(this).val();
			// grahaArray.push(item);
			grahaArray.push($(this).val());
		});
		jsonObj["nameEnglish"] = "mesha";
		jsonObj["grahas"] = grahaArray.join(",");
		jsonArray.push(jsonObj);

		rashiChakra["description"] = "Sasanka's Horoscope";
		rashiChakra["rashiDetails"] = jsonArray;

		horoscope["rashiChakra"] = rashiChakra;

		return JSON.stringify(horoscope);
	}
	;

	function prepareDivElement(data, text, divId, inputType) {
		/*
		 * var resultDiv = $('<div/>', { id: divId, text: text
		 * });
		 */// .addClass("newDiv purple bloated");
		// .append("<span/>")
		// .appendTo('#header');
		var resultDiv = $("<div/>").attr("id", divId).attr(
				"value", text);
		/*
		 * $.each(data, function() { $(divId).append( $('<input
		 * />', { type: 'radio', name: 'rdoOptions', id:
		 * 'rdoOptions' + this.Id }) ); $(".optionDiv").append(
		 * $('<label />', { 'text': this.Name }) )
		 * 
		 * });
		 */

		for (var i = 0; i < data.length; i++) {
			switch (inputType) {
			case 'radio':
				var radio = $("<input/>").attr("type", "radio")
						.attr("id", data[i].shlokaId) // "'"+data[i].shlokaId+"'"
						.attr("name", "shloka").attr("value",
								data[i].shlokaId);
				var label = $('<label />', {
					'text' : data[i].shlokaShortEnglish
				});
				// var label2 = $('<label />', {'text':
				// 'xxxxxxxxxxxx'});
				resultDiv.append(radio).append(label);
				// resultDiv.append(radio).append(label2);
				break;
			}
		}
		return resultDiv;
	}
	;

	// ==== Show Horoscope PDF ==== //
	// by click on horoscope pdf link in Report menu at left
	// panel, show the pdf in center with in a frame by calling
	// HoroscopeRestController
	// click the link and fire a custom event
	$("a").on("click", function() {
		var result = false;
		var menu = $(this).attr("menu");
		switch (menu) {
		case "horoscope":
			showHoroscopeForm();
			break;
		case "report":
			return showPdf(this); // imp to pass the 'this'
			// object
		}
		;
	});

	// show horoscope form
	function showHoroscopeForm() {
		$("#dummyContent").hide("scale", 500);
		$("#pdf").empty();
		$("#horoscopeForm").show("scale", 500);
		return false;
		;
	}
	;
	// show horoscope pdf
	function showPdf(obj) {
		var iframe = $("<iframe></iframe>");
		iframe
				.attr({
					id : "sasanka_kar_2015_114_8_E",
					src : $(obj).attr("href"),
					frameborder : "0",
					style : "overflow: hidden; height: 100%; width: 100%; position: absolute;"
				});

		// hide divs
		$("#dummyContent").hide("scale", 500);
		$("#horoscopeForm").hide("scale", 500);

		// clear the div then append and show pdf in div
		$("#pdf").empty();
		$("#pdf").append(iframe);
		$("#pdf").show(iframe);

		// Prevent the link from opening normally
		return false;
	};
	// serialize all form field values

});// jquery tag ends here
