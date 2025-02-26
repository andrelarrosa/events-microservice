package com.larrosa.events_microservice.domain;

import com.larrosa.events_microservice.dto.EventRequestDto;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="event")
@Table(name="event")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private int RegisteredParticipants;
    private String date;
    private String title;
    private String description;

    public Event(EventRequestDto eventRequestDto) {
        this.date = eventRequestDto.date();
        this.RegisteredParticipants = eventRequestDto.registeredParticipants();
        this.maxParticipants = eventRequestDto.maxParticipants();
        this.title = eventRequestDto.title();
        this.description = eventRequestDto.description();
    }
}
