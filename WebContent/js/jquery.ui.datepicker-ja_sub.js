/**
 * @fileoverview カレンダー
 * @author 自分の名前
 * @version 1.0
 * @date H2X. NN. NN
 */

$(function() {
	$("#sikakuDate").datepicker($.datepicker.regional['ja']);
	$("#sikakuDate").datepicker("option", "showOn", 'both');
	$("#sikakuDate").datepicker("option", "buttonImageOnly", true);
	$("#sikakuDate").datepicker("option", "buttonImage", 'images/ico_calendar.png');
});
