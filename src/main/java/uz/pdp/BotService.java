package uz.pdp;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BotService {
    public static SendMessage start(Update update) {
        SendMessage sendMessage=new SendMessage();
       sendMessage.setText("Raqaingizni yuboring: ");
       return sendMessage;
    }

    public static SendMessage menu(Long chatId) {
          return SendMessage.builder().build();
    }

    public static SendMessage showCart(Long chatId) {
        return SendMessage.builder().build();

    }

    public static SendMessage settings(Long chatId) {
        return SendMessage.builder().build();

    }
}
