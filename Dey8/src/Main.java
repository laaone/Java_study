//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Stu s = new Stu( "홍길동");
        Stu s2 = new Stu( 20);
        Stu s3 = new Stu("홍길동",20);
        Stu s4 = new Stu(20,"홍길동");
        Stu s5 = new Stu();

        System.out.println(s3.getAge() + 10);

System.out.println(s3.getName());

   s3.setName("이순신");
   System.out.println(s3.getName());

   s3.setAge(30);
   System.out.println(s3.getAge());


   School a = new School( "이순신","영어",100);
   School a1 = new School( "홍길동","국어",80);
   School a2 = new School( "이한나","수학",85);
   System.out.println(a.getName() + " " + a.getSubjects()+" "+ a.getScore());


   a2.setScore(87);
   a1.setSubjects( "문학");

   System.out.println(a2.getScore());
   System.out.println(a1.getSubjects());





   Pay d = new Pay("박원주","a100","사원",5500,2);
   Pay d2 = new Pay("정현희","a200","대리",4000,3);
   Pay d3 = new Pay("이재민","a300","사원",20800,1);

   System.out.println(d.getCleanup()+" "+d.getEmployeeName()+" "+d.getRank()+" "+d.getSalary()+" "+d.getAnnalLeave());
   System.out.println(d2.getCleanup()+" "+d2.getEmployeeName()+" "+d2.getRank()+" "+d2.getSalary()+" "+d2.getAnnalLeave());
   System.out.println(d3.getCleanup()+" "+d3.getEmployeeName()+" "+d3.getRank()+" "+d3.getSalary()+" "+d3.getAnnalLeave());
   System.out.println("____________________________________________________________________________");
   System.out.println("급여 총핣계"+(d.getSalary()+d2.getSalary()+d3.getSalary()));
   System.out.println("급여 평균"+(d.getSalary()+d2.getSalary()+d3.getSalary())/3);

   System.out.println("근무년수 총합계"+(d.getAnnalLeave()+d2.getAnnalLeave()+d3.getAnnalLeave()));
   System.out.println("근무년수 평균"+(d.getAnnalLeave()+d2.getAnnalLeave()+d3.getAnnalLeave())/3);
   System.out.println("____________________________________________________________________________");
   int max =0;
   Pay maxpay= null;
   if (max <d.getSalary() ){ max = d.getSalary(); maxpay =d;}
   if (max <d2.getSalary() ){ max = d2.getSalary(); maxpay =d2;}
   if (max <d3.getSalary() ){ max = d3.getSalary();maxpay =d3;}
   System.out.println( " 최고 연봉자:" + maxpay.getCleanup() + " " + maxpay.getEmployeeName()  );

   int min =100;
   Pay mini= null;
   if (min >d.getAnnalLeave() ){ min = d.getSalary(); mini =d;}
   if (min >d2.getAnnalLeave() ){ min = d2.getSalary(); mini =d2;}
   if (min >d3.getAnnalLeave() ){ min = d3.getSalary();mini =d3;}
   System.out.println( " 최소 근무년수:" + mini.getCleanup() + " " + mini.getEmployeeName()  );

    }


}
