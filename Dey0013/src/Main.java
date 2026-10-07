//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao() );
        dbWork(new MySqlDao()  );
    }
}