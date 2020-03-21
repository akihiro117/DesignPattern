package builder;

/**
 * select文の作成に使用するメソッドを定義する。
 */
class SelectBuilder extends SqlBuilder {
    private String sqlStatement;

    public void prepareTemplate() {
        this.sqlStatement = "select [columns] from [table];";
    }

    public void setTable(String tableName) {
        this.sqlStatement = this.sqlStatement.replace("[table]", tableName);
    }

    public void setColumns(String... columns) {
        String commaColumns = String.join(", ", columns);
        this.sqlStatement = this.sqlStatement.replace("[columns]", commaColumns);
    }

    public void setValues(String... values) {

    }

    public String getSqlStatement() {
        return this.sqlStatement;
    }
}