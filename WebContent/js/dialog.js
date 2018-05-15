/**
 * @fileoverview 確認ダイアログ
 * @author 自分の名前
 * @version 1.0
 * @date H2X. NN. NN
 */

$(function() {
	// buttonのvalue値を取得する
	var elements = document.getElementsByName("button");
	var value = elements[0].value;

	// dialog_buttonクラスのボタンが押されたときにダイアログオープン
	$('.dialog_button').click(function() {
		$('#dialog').dialog('open');
	});

	// id=dialog要素のダイアログパラメータ設定
	$('#dialog').dialog({
		autoOpen : false, // ダイアログを自動表示しない
		show : 'fold', // ダイアログが表示される際のエフェクト
		hide : 'fade', // ダイアログを閉じる際のエフェクト
		modal : true, // モーダル・ダイアログ
		position : "center top",
		width : 350,
		buttons : { // ダイアログにボタンを追加
			'ＯＫ' : function() {
				var submitType = document.createElement("input");
				submitType.setAttribute("type", "hidden");
				submitType.setAttribute("name", "button");
				submitType.setAttribute("value", value);
				document.dialogform.appendChild(submitType);
				document.dialogform.submit();
			},
			'キャンセル' : function() {
				$(this).dialog('close');
			},
		}
	});
});
