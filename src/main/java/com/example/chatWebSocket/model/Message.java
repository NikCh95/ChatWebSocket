package com.example.chatWebSocket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс описания модели
 * @author Chernenko N.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    /**
     * Содержание текста
     */
    private String content;

    /**
     * Отправитель
     */
    private String sender;

    /**
     * Статус сообщения
     */
    private Status status;
}
