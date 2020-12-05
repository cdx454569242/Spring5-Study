package Spring5.FactoryBean;

import Spring5.CollectionType.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author
 * @create 2020-09-16 13:53
 */
public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {

        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
