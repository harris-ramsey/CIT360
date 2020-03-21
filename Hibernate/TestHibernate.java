import org.hibernate.Session;
 
public class TestHibernate {
 
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        // Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("demo-user9@mail.com");
        emp.setFirstName("demo9");
        emp.setLastName("user9");
 
        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();

    }

}