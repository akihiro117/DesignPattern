package builder;

/**
 * SQL文のインスタンスの中身を作成するためのメソッドをまとめたクラス。 Builder。
 */
abstract class SqlBuilder {
    /**
     * SQL 文のテンプレートを設定。
     */
    abstract void prepareTemplate();

    /**
     * テーブル名を設定。
     * 
     * @param tableName テーブル名。
     */
    abstract void setTable(String tableName);

    /**
     * 列名を設定。
     * 
     * @param columns 列名。
     */
    abstract void setColumns(String... columns);

    /**
     * 値を設定。
     * 
     * @param values 値。
     */
    abstract void setValues(String... values);
}