/**
 * @fileoverview dataTableパラメータ設定js
 * @author 自分の名前
 * @version 1.0
 * @date H2X. NN. NN
 */

$(function() {
	$('#syain_table').dataTable({
		"language" : {
			"emptyTable" : "データが登録されていません。",
			"info" : "_TOTAL_ 件中 _START_ 件から _END_ 件までを表示",
			"infoEmpty" : "",
			"infoFiltered" : "(_MAX_ 件からの絞り込み表示)",
			"infoPostFix" : "",
			"thousands" : ",",
			"lengthMenu" : "1ページあたりの表示件数: _MENU_",
			"loadingRecords" : "ロード中",
			"processing" : "処理中...",
			"search" : "検索",
			"zeroRecords" : "該当するデータが見つかりませんでした。",
			"paginate" : {
				"first" : "先頭",
				"previous" : "前へ",
				"next" : "次へ",
				"last" : "末尾"
			}
		},
		"lengthMenu" : [ [ 5, 10, 25, -1 ], [ 5, 10, 25, "All" ] ],
		"order" : [],
		"stateSave" : true
	});
});
