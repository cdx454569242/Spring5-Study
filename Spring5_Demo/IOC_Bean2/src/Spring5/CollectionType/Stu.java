package Spring5.CollectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Stu {
    private String[] courses;

    private List<String> list;

    private Map<String,String> maps;

    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(courseList);
    }
}
