package uz.pdp;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import uz.pdp.util.BotMenu;
import uz.pdp.util.BotSettings;

public class FastFood extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
    if (update.hasMessage()){
        Message message=update.getMessage();
        SendMessage sendMessage=null;
        if(message.hasText()){

            String text = message.getText();

            switch (text){
                case BotMenu.START:{
                    sendMessage = BotService.start(update);
                }break;
                case BotMenu.MENU:{
                    sendMessage = BotService.menu(message.getChatId());
                }break;
                case BotMenu.CART:{
                    sendMessage = BotService.showCart(message.getChatId());
                }break;
                case BotMenu.SETTINGS:{
                    sendMessage = BotService.settings(message.getChatId());
                }break;
            }

        }
    }
    }
    @Override
    public String getBotUsername() {
       return BotSettings.BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return BotSettings.BOT_TOKEN;
    }

}
