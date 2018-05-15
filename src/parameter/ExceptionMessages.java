/**
 * ExceptionMessages.java  例外発生時のメッセージの定義クラス
 */
package parameter;

public class ExceptionMessages {
	private ExceptionMessages() {
	}　

	public static final String SYSTEM_EXCEPTION = "システムエラーが発生しました。";
	public static final String DB_CONNECT_EXCEPTION = "データベースへの接続時にエラーが発生しました。";
	public static final String DB_CLOSE_EXCEPTION = "データベースへの切断時にエラーが発生しました。";

	public static final String LOGIN_EXCEPTION = "ログイン情報の取得時にエラーが発生しました。";
	public static final String SYAIN_SELECT_EXCEPTION = "社員情報の取得時にエラーが発生しました。";
	public static final String SYAIN_ENTRY_EXCEPTION = "社員情報の登録時にエラーが発生しました。";
	public static final String SYAIN_UPDATE_EXCEPTION = "社員情報の更新時にエラーが発生しました。";

	public static final String SYAIN_ROLES_ENTRY_EXCEPTION = "社員ロール情報の登録時にエラーが発生しました。";

	public static final String SIKAKU_SELECT_EXCEPTION = "資格情報の取得時にエラーが発生しました。";

	public static final String SKILL_ENTRY_EXCEPTION = "社員スキル情報の取得時にエラーが発生しました。";

}
