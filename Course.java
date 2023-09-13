package de.tum.in.ase;

import org.checkerframework.checker.nullness.qual.NonNull;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class Course {

    private @NonNull String name;
    private @NonNull CourseAccess courseAccess;
    private @NonNull List<User> participants;
    private @NonNull String description;

    public Course(@NonNull String name, @NonNull CourseAccess courseAccess, @NonNull List<User> participants, @NonNull String description) {
        this.name = name;
        this.courseAccess = courseAccess;
        this.participants = participants;
        this.description = description;
    }

//    /**
//     * Serializes the Course object into a JSONObject
//     * @return The serialized course as JSONObject
//     */
    public @NonNull JSONObject toJson() {
//        TODO: Task 3.1: implement toJson()
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", getName());
        jsonObject.put("access", getCourseAccess());
        JSONArray jsonArray = new JSONArray();
        for (User u
                :
                participants) {
            jsonArray.put(u.toJson().get("name"));
        }
        jsonObject.put("participantNames", jsonArray);
        jsonObject.put("description", getDescription());

        return jsonObject;
    }

//    /**
//     * Deserializes the JSONObject to a Course object.
//     * @param json The JSONObject to deserialize
//     * @param userManager The UserManager to retrieve the User objects from
//     * @return The deserialized Course
//     */
    public static @NonNull Course fromJson(@NonNull JSONObject json, @NonNull UserManager userManager) {
//        TODO: Task 3.2: implement fromJson()
        JSONArray jsonArray = json.getJSONArray("participantNames");
        List<User> users = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            String name = jsonArray.getString(i);
            for (int j = 0; j < userManager.getUsers().size(); j++) {
                if (userManager.getUsers().get(j).getName().equals(name)) {
                    users.add(userManager.getUsers().get(j));
                    break;
                }
            }
        }
        return new Course(json.get("name").toString(), CourseAccess.valueOf(json.getString("access")), users, json.get("description").toString());

    }

    public @NonNull String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public @NonNull List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(@NonNull List<User> participants) {
        this.participants = participants;
    }

    public @NonNull CourseAccess getCourseAccess() {
        return courseAccess;
    }

    public void setCourseAccess(@NonNull CourseAccess courseAccess) {
        this.courseAccess = courseAccess;
    }

    public @NonNull String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{"
                + "name='" + name + '\''
                + ", courseAccess=" + courseAccess
                + ", participants=" + participants
                + ", description='" + description + '\''
                + '}';
    }

}
