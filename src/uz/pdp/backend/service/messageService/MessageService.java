package uz.pdp.backend.service.messageService;

import uz.pdp.backend.models.Message;
import uz.pdp.backend.service.BaseService;

public interface MessageService extends BaseService<Message> {
    boolean sendMessage(String message);
}
