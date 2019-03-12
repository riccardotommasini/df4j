package it.polimi.deib.df4j;

public class Employee {
    public final int empno;
    public final String name;
    public final int deptno;

    public Employee(int empno, String name, int deptno) {
        this.empno = empno;
        this.name = name;
        this.deptno = deptno;
    }

    public String toString() {
        return "Employee(name: " + name + ", deptno:" + deptno + ")";
    }
}