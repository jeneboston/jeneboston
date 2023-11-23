package de.ait.Aufgabe_29_10_2023;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Objects;

public class User {
    private int id;
    private String name;

    private ArrayList<User> friends = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean addFriend(User newFriend){
        if(newFriend == null){
            LOGGER.error("Пользователь не найден");
            return false;
        }
        for ( User friend: friends) {
            if(friend.getId() == newFriend.getId()){
                LOGGER.error("Пользователь с таким id {} существует в списке друзей", friend.getId());
                return false;
            }
        }
        LOGGER.info("Новый пользователь с id {} успешно добавлен в друзья");
        return friends.add(newFriend);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
