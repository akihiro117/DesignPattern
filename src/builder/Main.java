package builder;

class Main {
    public static void main(String[] args) {
        SelectBuilder selectBuilder = new SelectBuilder();
        SqlDirector selectDirector = new SqlDirector(selectBuilder);
        selectDirector.buildSql();
        System.out.println(selectBuilder.getSqlStatement());

        UpdateBuilder updateBuilder = new UpdateBuilder();
        SqlDirector updateDirector = new SqlDirector(updateBuilder);
        updateDirector.buildSql();
        System.out.println(updateBuilder.getSqlStatement());
    }
}