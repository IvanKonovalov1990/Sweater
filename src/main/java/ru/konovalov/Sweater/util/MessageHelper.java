package ru.konovalov.Sweater.util;

import ru.konovalov.Sweater.models.User;

public abstract class MessageHelper {
    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<none>";
    }
}
