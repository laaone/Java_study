public class Mysql extends Db{

private String dbName = "mysql";

    @Override
    void printDb() {
        System.out.println( dbName + "실행 합니다.");

    }
}
