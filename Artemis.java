package de.tum.in.ase;

import org.checkerframework.checker.nullness.qual.NonNull;



public class Artemis {

    private UserManager userManager;
    private CourseManager courseManager;

    public void setUserManager(@NonNull UserManager userManager) {
        this.userManager = userManager;
    }

    public void setCourseManager(@NonNull CourseManager courseManager) {
        this.courseManager = courseManager;
    }

    public @NonNull UserManager getUserManager() {
        return userManager;
    }

    public @NonNull CourseManager getCourseManager() {
        return courseManager;
    }

    public static void main(String[] args) {
        // You can test your code here
//        List<User> users =  new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//            users.add(new User("u"+i,"same"));
//        }
//        Course c1 = new Course("sdf",CourseAccess.PUBLIC,users,"sfdfsdfsdf");
//        Artemis a= new Artemis();
//        CourseManager cm = new CourseManager(a);
//        UserManager um = new UserManager();
//        a.setUserManager(um);
//        a.setCourseManager(cm);
//
//        System.out.println();

    }

}
