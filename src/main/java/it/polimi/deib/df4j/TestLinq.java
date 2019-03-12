package it.polimi.deib.df4j;

import org.apache.calcite.linq4j.Enumerable;
import org.apache.calcite.linq4j.Linq4j;
import org.apache.calcite.linq4j.function.Function0;
import org.apache.calcite.linq4j.function.Function1;
import org.apache.calcite.linq4j.function.Functions;

public class TestLinq {


    public static final Employee[] EMPS = {
            new Employee(100, "Fred", 10),
            new Employee(110, "Bill", 30),
            new Employee(120, "Eric", 10),
            new Employee(130, "Janet", 10),
    };

    public static final Function1<Employee, Integer> EMP_DEPTNO_SELECTOR =
            employee -> employee.deptno;

    public static void main(String[] args) {
        Enumerable<Employee> employees = Linq4j.asEnumerable(EMPS);


        String s = employees
                .groupBy(
                        EMP_DEPTNO_SELECTOR,
                        (Function0<String>) () -> null,
                        (v1, e0) -> v1 == null ? e0.name : (v1 + "+" + e0.name),
                        (v1, v2) -> v1 + ": " + v2)
                .orderBy(Functions.identitySelector())
                .toList()
                .toString();


        System.out.println(s);
        assert s.equals("[10: Fred+Eric+Janet, 30: Bill]");
    }
}
