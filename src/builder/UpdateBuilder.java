package builder;

import java.util.Arrays;

/**
 * update文の作成に使用するメソッドを定義する。
 */
class UpdateBuilder extends SqlBuilder {

    private String sqlStatement;

    @Override
    void prepareTemplate() {
        this.sqlStatement = "update [table] set [assinment];";
    }

    @Override
    void setTable(String tableName) {
        this.sqlStatement = this.sqlStatement.replace("[table]", tableName);
    }

    @Override
    void setColumns(String... columns) {
        String columnsStatement = String.join(" = <value>, ", columns) + " = <value>";
        this.sqlStatement = this.sqlStatement.replace("[assinment]", columnsStatement);
    }

    @Override
    void setValues(String... values) {
        Arrays.asList(values).stream()
                .forEach(value -> this.sqlStatement = this.sqlStatement.replaceFirst("<value>", value));
    }

    String getSqlStatement() {
        return this.sqlStatement;
    }

}