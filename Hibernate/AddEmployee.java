import org.hibernate.Session;

public class AddEmployee {

    /**
     * Connect to MySQL Database and add
     * additions to employee table
     */
    public static void creation() {

    Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        // Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("demo-user8@mail.com");
        emp.setFirstName("demo8");
        emp.setLastName("user8");
 
        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}