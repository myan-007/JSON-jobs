package de.tum.in.ase;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.json.JSONArray;

import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Utils {

    //    /**
//     * Parses the passed user list into a JSONArray using Streams
//     * @param userList The user list to parse
//     * @return The JSONArray containing the parsed users
//     */
    public @NonNull JSONArray jsonArrayFromUserList(@NonNull List<User> userList) {
//        TODO: Bonus Task: implement jsonArrayFromUserList()

//        return userList.stream().map(User::toJson).collect(Collector.of(JSONArray::new, JSONArray::put, JSONArray::putAll));
        return new JSONArray(userList.stream().map(User::toJson).collect(Collectors.toList()));
    }

    //    /**
//     * Parses the passed course list into a JSONArray using Streams
//     * @param courseList The course list to parse
//     * @return The JSONArray containing the parsed courses
//     */
    public @NonNull JSONArray jsonArrayFromCourseList(@NonNull List<Course> courseList) {
//        TODO: Bonus Task: implement jsonArrayFromCourseList()

        return new JSONArray(courseList.stream().map(Course::toJson).collect(Collectors.toList()));
//        return courseList.stream().map(Course::toJson).collect(Collector.of(JSONArray::new, JSONArray::put, JSONArray::put));

    }

}
