package ru.sspo.e_ticket_queue;

import java.time.LocalDateTime;

public class Ticket {
    /**
     * Создать класс Ticket (не бин!!!) с полями:
     * 2.1. String number - номер тикета
     * 2.2. LocalDateTime createdAt - дата создания
     * 2.3. ... (любые другие поля)
     */

    private final String number;
    private final LocalDateTime createdAt;
    private String status;

    public Ticket(String number, LocalDateTime createdAt) {
        this.number = number;
        this.createdAt = createdAt;
        this.status = "CREATED";
    }

    public String getNumber() {
        return number;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                ", status='" + status + '\'' +
                '}';
    }
}
