//package hibernate.test;
 
//import hibernate.test.dto.EmployeeEntity;
//import org.hibernate.Session;
 
public class TestHibernate {
 
    public static void main(String[] args) {
        
        AddEmployee.creation();
        /*Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        // Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("demo-user7@mail.com");
        emp.setFirstName("demo7");
        emp.setLastName("user7");
 
        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();   */

    }

}