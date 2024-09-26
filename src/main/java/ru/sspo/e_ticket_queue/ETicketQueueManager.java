package ru.sspo.e_ticket_queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ETicketQueueManager {
    /**
     * Класс "Табло" - бин (синглтон), у которого есть поле ticketNumberGenerator
     * и метод метод newTicket(), который создает объетк класса Ticket с значениями полей:
     * 3.1 number - результат вызова TicketNumberGenerator#createNewNumber
     * 3.2 createdAt - LocalDateTime.now()
     * 3.3 ...
     */

    private final TicketNumberGenerator ticketNumberGenerator;

    @Autowired
    public ETicketQueueManager(TicketNumberGenerator ticketNumberGenerator) {
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    public Ticket newTicket() {
        return new Ticket(ticketNumberGenerator.createNewNumber(), LocalDateTime.now());
    }
}
