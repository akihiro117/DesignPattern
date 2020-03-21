package builder;

/**
 * Builder を使用して、インスタンスの中身を作るクラス。Director。
 */
class SqlDirector {
    private SqlBuilder builder;

    public SqlDirector(SqlBuilder builder) {
        this.builder = builder;
    }

    public void buildSql() {
        this.builder.prepareTemplate();
        this.builder.setTable("SampleTable");
        this.builder.setColumns("Column1", "Column2");
        this.builder.setValues("value1", "value2");
    }
}