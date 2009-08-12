package example;

import java.sql.Connection;
import java.sql.Statement;

import junit.framework.TestCase;

public abstract class TutorialTestCase extends TestCase {

	protected AppConfig appConfig = new AppConfig();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Connection connection = appConfig.dataSource().getConnection();
		try {
			Statement statement = connection.createStatement();
			try {
				statement
						.execute("create table employee (id integer generated by default as identity(start with 0) not null primary key,name varchar(255) not null,salary integer,version integer not null)");
				statement
						.execute("insert into employee values(1,'ALLEN',1600,1)");
				statement
						.execute("insert into employee values(2,'WARD',1250,1)");
				statement
						.execute("insert into employee values(3,'JONES',2975,1)");
				statement
						.execute("insert into employee values(4,'MARTIN',1250,1)");
				statement
						.execute("insert into employee values(5,'BLAKE',2850,1)");
				statement
						.execute("insert into employee values(6,'CLARK',2450,1)");
				statement
						.execute("insert into employee values(7,'SCOTT',3000,1)");
				statement
						.execute("insert into employee values(8,'KING',5000,1)");
				statement
						.execute("insert into employee values(9,'TURNER',1500,1)");
				statement
						.execute("insert into employee values(10,'ADAMS',1100,1)");
				statement
						.execute("insert into employee values(11,'JAMES',950,1)");
				statement
						.execute("insert into employee values(12,'FORD',3000,1)");
				statement
						.execute("insert into employee values(13,'MILLER',1300,1)");
				statement
						.execute("insert into employee values(14,'SMITH',800,1)");
			} finally {
				statement.close();
			}
		} finally {
			connection.close();
		}
	}

	@Override
	protected void tearDown() throws Exception {
		Connection connection = appConfig.dataSource().getConnection();
		try {
			Statement statement = connection.createStatement();
			try {
				statement.execute("drop table employee;");
			} finally {
				statement.close();
			}
		} finally {
			connection.close();
		}
		super.tearDown();
	}

}
